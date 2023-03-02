package com.tomspencerlondon.algorithms.educative.graphs.challenge9.attempt2;

import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjencyList;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjencyList = new LinkedList[this.vertices];

        for (int i = 0; i < this.vertices; i++) {
            this.adjencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        this.adjencyList[source].add(destination);
        this.adjencyList[destination].add(source);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList<Integer>[] getAdj() {
        return this.adjencyList;
    }
}
