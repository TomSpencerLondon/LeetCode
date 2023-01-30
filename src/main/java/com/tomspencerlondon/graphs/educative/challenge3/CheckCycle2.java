package com.tomspencerlondon.graphs.educative.challenge3;

import java.util.HashSet;
import java.util.Set;

public class CheckCycle2 {
    public static boolean detectCycle(Graph g) {
        System.out.println("\nStarted graph: ");
        // Write -- Your -- Code
        Set<Integer> visiting = new HashSet<>();

        for (int i = 0; i < g.vertices; i++) {
            if (hasCycle(g, i, visiting)) {
                return true;
            }
            System.out.println("\n---");
        }
        return false;
    }

    private static boolean hasCycle(Graph g, int v, Set<Integer> visiting) {
       visiting.add(v);

        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[v].headNode;

        while (headNode != null) {
            Integer data = headNode.data;
                if (visiting.contains(data)) {
                    return true;
                }
                if (hasCycle(g, data, visiting)) {
                    return true;
                }

                visiting.remove(data);

            headNode = headNode.nextNode;
        }

        return false;
    }
}
