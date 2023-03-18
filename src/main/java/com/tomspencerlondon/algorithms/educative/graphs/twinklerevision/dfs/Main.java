package com.tomspencerlondon.algorithms.educative.graphs.twinklerevision.dfs;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 1);
        boolean[] visited = new boolean[graph.getVertices()];
        visited[0] = true;
        dfs(graph, 0, visited);
    }

    private static void dfs(Graph graph, int current, boolean[] visited) {
        System.out.println(current);
        for (Integer neighbour : graph.getAdj()[current]) {
            if (!visited[neighbour]) {
                visited[neighbour] = true;
                dfs(graph, neighbour, visited);
            }
        }
    }


}
