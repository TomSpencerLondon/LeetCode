package com.tomspencerlondon.algorithms.educative.graphs.challenge3;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 5);
        graph.addEdge(2, 4);

        int level1 = numberOfNodesInGivenLevel(graph, 0, 1);
        System.out.println(level1);
        int level2 = numberOfNodesInGivenLevel(graph, 0, 2);
        System.out.println(level2);
        int level3 = numberOfNodesInGivenLevel(graph, 0, 3);
        System.out.println(level3);
        int level4 = numberOfNodesInGivenLevel(graph, 0, 4);
        System.out.println(level4);
    }

    private static int numberOfNodesInGivenLevel(Graph graph, int source, int level) {
        int count = 0;
        int numVertices = graph.getVertices();

        int[] visited = new int[numVertices];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[source] = 1;
        queue.add(source);

        while (queue.size() > 0) {
            source = queue.poll();

            LinkedList<Integer>[] linkedLists = graph.getAdj();

            ListIterator<Integer> iterator = linkedLists[source].listIterator();

            while (iterator.hasNext()) {
                Integer temp = iterator.next();

                if (visited[temp] != 1) {
                    visited[temp] = visited[source] + 1;

                    if (visited[temp] < level) {
                        queue.add(temp);
                    }
                }
            }
        }

        for (int i = 0; i < numVertices; i++) {
            if (visited[i] == level) {
                count++;
            }
        }

        return count;
    }
}
