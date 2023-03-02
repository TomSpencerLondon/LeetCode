package com.tomspencerlondon.algorithms.educative.graphs.challenge7.attempt2;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(5, 3);
        g.addEdge(5, 6);
        g.addEdge(3, 6);

        System.out.println("The connected components are: ");
        printConnectedComponents(g);
    }

    private static void printConnectedComponents(Graph graph) {
        int numVertices = graph.getVertices();
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                checkForConnections(graph, i, visited);
                System.out.println();
            }
        }
    }

    private static void checkForConnections(Graph graph, int source, boolean[] visited) {
        visited[source] = true;
        System.out.print(source + " ");

        LinkedList<Integer>[] linkedLists = graph.getAdj();
        for (Integer next : linkedLists[source]) {
            if (!visited[next]) {
                checkForConnections(graph, next, visited);
            }
        }
    }
}
