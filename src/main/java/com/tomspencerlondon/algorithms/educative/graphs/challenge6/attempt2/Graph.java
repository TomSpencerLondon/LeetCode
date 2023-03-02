package com.tomspencerlondon.algorithms.educative.graphs.challenge6.attempt2;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < this.vertices; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        this.adjacencyList[source].add(destination);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList<Integer>[] getAdj() {
        return this.adjacencyList;
    }

    public Graph getTranspose() {
        Graph graph = new Graph(vertices);

        for (int vertex = 0; vertex < vertices; vertex++) {
            Iterator<Integer> iterator = adjacencyList[vertex].iterator();

            while (iterator.hasNext()) {
                graph.adjacencyList[iterator.next()].add(vertex);
            }
        }

        return graph;
    }
}
