package com.tomspencerlondon.graphs.educative.challenge6;

import java.util.HashSet;
import java.util.Set;

public class CheckPaths {
    public static boolean checkPath(Graph g, int source, int destination) {
        Set<Integer> visited = new HashSet<>();

        Stack<Integer> stack = new Stack<>(g.vertices);

        if (source == destination) {
            return true;
        }

        stack.push(source);
        visited.add(source);

        while (!stack.isEmpty()) {
            Integer current = stack.pop();

            DoublyLinkedList<Integer>.Node head = g.adjacencyList[current].headNode;

            while (head != null) {
                Integer data = head.data;
                if (!visited.contains(data)) {
                    if (data == destination) {
                        return true;
                    }
                }

                stack.push(data);
                visited.add(data);

            }
        }



        return false;
    }
}
