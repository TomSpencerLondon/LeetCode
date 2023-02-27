package com.tomspencerlondon.algorithms.educative.graphs.challenge7;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 3);
        graph.addEdge(5, 6);
        graph.addEdge(3, 6);

        System.out.println("The connected components are: ");
        printConnectedComponents(graph);
    }

    private static void printConnectedComponents(Graph graph) {
        int numVertices = graph.getVertices();
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                checkForVisited(graph, i, visited);
                System.out.println();
            }
        }
    }

    private static void checkForVisited(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.println(vertex + " ");

        LinkedList<Integer>[] linkedLists = graph.getAdj();

        for (Integer neighbour : linkedLists[vertex]) {
            if (!visited[neighbour]) {
                checkForVisited(graph, neighbour, visited);
            }
        }
    }
}
