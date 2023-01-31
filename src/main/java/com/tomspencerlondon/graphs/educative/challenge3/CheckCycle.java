package com.tomspencerlondon.graphs.educative.challenge3;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class CheckCycle {
    public static boolean detectCycle(Graph g) {
        System.out.println("\nStarted graph: ");
        // Write -- Your -- Code

        for (int i = 0; i < g.vertices; i++) {
            if (dfs(g, i)) {
                return true;
            }
            System.out.println("\n---");
        }
        return false;
    }

    public static boolean dfs(Graph g, int index) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(index);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[current].headNode;

                while (headNode != null) {
                    Integer data = headNode.data;

                    if (index == data) {
                        return true;
                    }

                    stack.push(data);
                    headNode = headNode.nextNode;
                }
            }
        }

        return false;
    }

}
