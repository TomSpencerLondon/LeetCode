package com.tomspencerlondon.algorithms.educative.graphs.challenge4.attempt2;

import java.io.*;
import java.util.*;

class Graph {
    private int vertices; //number of vertices
    private LinkedList < Integer > adjacencyList[]; //Adjacency Lists
    @SuppressWarnings("unchecked")
        // Constructor
    Graph(int vert) {
        this.vertices = vert;
        this.adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < this.vertices; ++i)
            this.adjacencyList[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int source, int destination) {
        this.adjacencyList[source].add(destination);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList < Integer > [] getAdj() {
        return this.adjacencyList;
    }

    void printGraph() {

        for (int v = 0; v < this.vertices; v++) {
            System.out.print(v);
            for (Integer pCrawl: this.adjacencyList[v]) {
                System.out.print("->" + pCrawl);
            }
            System.out.print("\n");
        }
    }
};
