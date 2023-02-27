package com.tomspencerlondon.algorithms.educative.graphs.challenge7;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.LinkedList;

public class Graph {

    int vertices;
    LinkedList<Integer>[] adjacencyList;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < this.vertices; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        this.adjacencyList[source].add(destination);

        this.adjacencyList[destination].add(source);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList<Integer>[] getAdj() {
        return this.adjacencyList;
    }
}
