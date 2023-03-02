package com.tomspencerlondon.algorithms.educative.graphs.challenge6.attempt2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(2, 4);
        graph.addEdge(4, 2);

        System.out.println("First graph is strongly connected? " + isStronglyConnected(graph));

        Graph graph2 = new Graph(4);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(2, 3);

        System.out.println("Second graph is strongly connected? " + isStronglyConnected(graph2));

    }

    private static boolean isStronglyConnected(Graph graph) {
        int numVertices = graph.getVertices();
        boolean[] visited = new boolean[numVertices];

        dfs(graph, 0, visited);

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        Graph transpose = graph.getTranspose();

        Arrays.fill(visited, false);

        dfs(transpose, 0, visited);

        return IntStream.range(0, numVertices).allMatch(i -> visited[i]);
    }

    private static void dfs(Graph graph, int source, boolean[] visited) {
        visited[source] = true;
        LinkedList<Integer>[] linkedLists = graph.getAdj();

        for (Integer temp : linkedLists[source]) {
            if (!visited[temp]) {
                dfs(graph, temp, visited);
            }
        }
    }


}