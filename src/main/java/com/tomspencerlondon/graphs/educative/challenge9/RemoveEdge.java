package com.tomspencerlondon.graphs.educative.challenge9;

public class RemoveEdge {
    public static void removeEdge(Graph g, int source, int destination) {
        g.adjacencyList[source].deleteByValue(destination);
    }
}
