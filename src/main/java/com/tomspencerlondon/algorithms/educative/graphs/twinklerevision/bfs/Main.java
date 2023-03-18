package com.tomspencerlondon.algorithms.educative.graphs.twinklerevision.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);

        bfs(graph);
    }

    private static void bfs(Graph graph) {
        LinkedList<Integer>[] adj = graph.getAdj();
        boolean[] visited = new boolean[graph.getVertices()];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            Integer current = queue.remove();
            System.out.println(current);

            for (Integer neighbour : adj[current]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }
}
