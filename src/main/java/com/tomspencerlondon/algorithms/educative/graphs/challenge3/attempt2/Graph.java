package com.tomspencerlondon.algorithms.educative.graphs.challenge3.attempt2;

import com.tomspencerlondon.sedgewick.In;

import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < this.vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
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
}