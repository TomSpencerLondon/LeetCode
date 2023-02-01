package com.tomspencerlondon.graphs.educative.challenge7;

import java.util.HashSet;
import java.util.Set;

public class CheckTree {
    public static boolean isTree(Graph g) {
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < g.vertices; i++) {
            if (bfs(g, i)) {
                return true;
            }
        }

        return false;
    }

    public static boolean bfs(Graph g, int source) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new Queue<>(g.vertices);

        queue.enqueue(source);
        visited.add(source);

        int numberOfVisited = 1;

        while (!queue.isEmpty()) {
            int current = queue.dequeue();

            DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[current].headNode;

            while (headNode != null) {
                Integer data = headNode.data;
                if (!visited.contains(data)) {
                    queue.enqueue(data);
                    visited.add(data);
                    numberOfVisited++;
                } else {
                    return false;
                }

                headNode = headNode.nextNode;
            }

        }

        return numberOfVisited == g.vertices;

    }
}
