package com.tomspencerlondon.algorithms.educative.graphs.challenge8;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);

        System.out.println("Separate components created due to deletion of edge 1 -> 2? " + willCauseSeparateComponents(graph, 1, 2));
        System.out.println("Separate components created due to deletion of edge 3 -> 4? " + willCauseSeparateComponents(graph, 3, 4));
    }

    private static boolean willCauseSeparateComponents(Graph graph, int source, int destination) {
        graph.getAdj()[source].remove(graph.getAdj()[source].indexOf(destination));
        graph.getAdj()[destination].remove(graph.getAdj()[destination].indexOf(source));

        return !isConnected(graph);
    }

    public static boolean isConnected(Graph graph) {
        int numVertices = graph.getVertices();
        boolean[] visited = new boolean[numVertices];

        graph.dfsTraversal(0, visited);

        for (int i = 1; i < numVertices; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }
}