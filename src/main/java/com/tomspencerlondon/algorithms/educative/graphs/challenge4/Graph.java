package com.tomspencerlondon.algorithms.educative.graphs.challenge4;

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
        return vertices;
    }

    public LinkedList<Integer>[] getAdj() {
        return this.adjacencyList;
    }

    void printGraph() {
        for (int source = 0; source < this.vertices; source++) {
            System.out.print(source);

            for (Integer destination : this.adjacencyList[source]) {
                System.out.print("-> " + destination);
            }

            System.out.println();
        }
    }
}
