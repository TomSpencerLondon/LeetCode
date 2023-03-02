package com.tomspencerlondon.algorithms.educative.graphs.challenge8.attempt2;


import java.util.Iterator;
import java.util.stream.IntStream;

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

        boolean[] visited = new boolean[graph.getVertices()];

        dfs(graph, 0, visited);

        return IntStream.range(0, graph.getVertices()).anyMatch(i -> !visited[i]);
    }

    private static void dfs(Graph graph, int source, boolean[] visited) {
        visited[source] = true;

        Iterator<Integer> iterator = graph.getAdj()[source].iterator();

        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if (!visited[next]) {
                dfs(graph, next, visited);
            }
        }
    }
}
