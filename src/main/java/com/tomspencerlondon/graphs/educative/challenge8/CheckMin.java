package com.tomspencerlondon.graphs.educative.challenge8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckMin {
    public static int findShortestPathLength(Graph g, int source, int destination) {
        Set<Integer> visited = new HashSet<>();
        int[] distances = new int[g.vertices];

        Arrays.fill(distances, -1);
        distances[source] = 0;

        Queue<Integer> queue = new Queue<>(g.vertices);
        queue.enqueue(source);

        while (!queue.isEmpty()) {
            int current = queue.dequeue();
            DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[current].headNode;

            if (!visited.contains(current)) {
                visited.add(current);

                while (headNode != null) {

                    Integer data = headNode.data;
                    if (distances[data] == -1) {
                        distances[data] = distances[current] + 1;
                        queue.enqueue(data);
                    }

                    headNode = headNode.nextNode;
                }
            }
        }

        return distances[destination];
    }
}
