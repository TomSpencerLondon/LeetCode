package com.tomspencerlondon.graphs.educative.challenge3;

import java.util.HashSet;
import java.util.Set;

public class CheckCycle2 {
    public static boolean detectCycle(Graph g) {
        System.out.println("\nStarted graph: ");
        // Write -- Your -- Code
        Set<Integer> visiting = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < g.vertices; i++) {
            if (hasCycle(g, i, visiting, visited)) {
                return true;
            }
            System.out.println("\n---");
        }
        return false;
    }

    private static boolean hasCycle(Graph g, int v, Set<Integer> visiting, Set<Integer> visited) {
       visiting.add(v);

        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[v].headNode;

        while (headNode != null) {
            Integer data = headNode.data;
            if (!visited.contains(data)) {
                if (visiting.contains(data)) {
                    return true;
                }
                if (hasCycle(g, data, visiting, visited)) {
                    return true;
                }

                visiting.remove(data);
                visited.remove(data);
            }

            headNode = headNode.nextNode;
        }

        return false;
    }
}
