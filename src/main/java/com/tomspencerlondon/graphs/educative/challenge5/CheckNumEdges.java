package com.tomspencerlondon.graphs.educative.challenge5;

class CheckNumEdges {
    public static int numEdges(Graph g) {
        // Write -- Your -- Code
        int sum = 0;
        int vertices = g.vertices;
        for (int i = 0; i < vertices; i++) {
            sum += g.adjacencyList[i].size;
        }

        return sum / 2;
    }
}
