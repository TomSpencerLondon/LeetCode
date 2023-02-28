package com.tomspencerlondon.algorithms.educative.graphs.challenge3.attempt2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 5);
        graph.addEdge(2, 4);

        System.out.println(numberOfNodesInGivenLevel(graph, 0, 1));
        System.out.println(numberOfNodesInGivenLevel(graph, 0, 2));
        System.out.println(numberOfNodesInGivenLevel(graph, 0, 3));
        System.out.println(numberOfNodesInGivenLevel(graph, 0, 4));
    }


    public static int numberOfNodesInGivenLevel(Graph g, int source, int level) {
        int count = 0; //count initialized to zero
        int num_of_vertices = g.getVertices(); //getVertices given in Graph.java file
        int currentLevel = 1;
        boolean[] visited = new boolean[num_of_vertices];

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(List.of(source, currentLevel));

        while (!queue.isEmpty()) {
            List<Integer> currentSourceAndLevel = queue.poll();
            Iterator<Integer> iterator = g.getAdj()[currentSourceAndLevel.get(0)].iterator();
            if (currentSourceAndLevel.get(1) == level) {
                count++;
            }

            while (iterator.hasNext()) {
                int temp = iterator.next();
                if (!visited[temp]) {
                    queue.add(List.of(temp, currentSourceAndLevel.get(1) + 1));
                    visited[temp] = true;
                }
            }
        }

        return count;
    }

}
