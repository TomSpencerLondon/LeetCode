package com.tomspencerlondon.algorithms.educative.graphs.challenge9.attempt2;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 1);

        Graph graph2 = new Graph(7);
        graph2.addEdge(3, 2);
        graph2.addEdge(1, 4);
        graph2.addEdge(2, 1);
        graph2.addEdge(5, 3);
        graph2.addEdge(6, 2);
        graph2.addEdge(3, 1);

        boolean[] discovered = new boolean[8];
        boolean[] color = new boolean[8];
        discovered[1] = true;
        color[1] = false;

        System.out.println("Graph 1 is bipartite: " + isBipartite(graph, 1, discovered, color));
        System.out.println("Graph 2 is bipartite: " + isBipartite(graph2, 1, discovered, color));

    }

    private static boolean isBipartite(Graph graph, int source, boolean[] visited, boolean[] color) {
        for (Integer vertex : graph.getAdj()[source]) {
            if (!visited[vertex]) {
                visited[vertex] = true;
                color[vertex] = !color[source];
                if (!isBipartite(graph, vertex, visited, color)) {
                    return false;
                }
            } else if (color[source] == color[vertex]) {
                return false;
            }
        }

        return true;
    }
}
