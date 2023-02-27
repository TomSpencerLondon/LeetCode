package com.tomspencerlondon.algorithms.educative.graphs.challenge8;

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
        this.adjacencyList[destination].add(source);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList<Integer>[] getAdj() {
        return this.adjacencyList;
    }

    public void dfsTraversal(int vertex, boolean[] visited) {
        visited[vertex] = true;

        int source = 0;

        Iterator<Integer> iterator = adjacencyList[vertex].iterator();

        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (!visited[temp]) {
                dfsTraversal(temp, visited);
            }
        }
    }
}
