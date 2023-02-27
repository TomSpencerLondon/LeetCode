package com.tomspencerlondon.algorithms.educative.graphs.challenge6;

import java.util.Iterator;
import java.util.LinkedList;

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

        checkForUnvisitedVertices(graph, 0, visited);

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        Graph transposedGraph = graph.getTranspose();

        for (int i = 0; i < numVertices; i++) {
            visited[i] = false;
        }

        checkForUnvisitedVertices(transposedGraph, 0, visited);

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }


    public static void checkForUnvisitedVertices(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;

        LinkedList<Integer>[] linkedLists = graph.getAdj();

        Iterator<Integer> iterator = linkedLists[vertex].iterator();

        while(iterator.hasNext()) {
            int temp = iterator.next();

            if (!visited[temp]) {
                checkForUnvisitedVertices(graph, temp, visited);
            }
        }
    }
}
