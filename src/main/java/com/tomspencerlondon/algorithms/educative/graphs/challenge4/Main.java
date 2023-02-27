package com.tomspencerlondon.algorithms.educative.graphs.challenge4;

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

        graph.printGraph();

        System.out.println("Transpose of graph: ");

        Graph transposedGraph = transpose(graph);

        transposedGraph.printGraph();
    }

    private static Graph transpose(Graph graph) {
        int numVertices = graph.getVertices();

        Graph result = new Graph(numVertices);

        LinkedList<Integer>[] linkedLists = graph.getAdj();

        for (int source = 0; source < graph.getVertices(); source++) {
            for (int destination = 0; destination < linkedLists[source].size(); destination++) {
                result.addEdge(linkedLists[source].get(destination), source);
            }
        }

        return result;
    }
}
