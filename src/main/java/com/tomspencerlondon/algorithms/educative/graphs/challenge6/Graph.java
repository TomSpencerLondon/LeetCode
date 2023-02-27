package com.tomspencerlondon.algorithms.educative.graphs.challenge6;

import java.util.LinkedList;
import java.util.ListIterator;

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

        for (int current = 0; current < vertices; current++) {
            ListIterator<Integer> iterator = adjacencyList[current].listIterator();

            while (iterator.hasNext()) {
                graph.adjacencyList[iterator.next()].add(current);
            }
        }

        return graph;
    }
}
