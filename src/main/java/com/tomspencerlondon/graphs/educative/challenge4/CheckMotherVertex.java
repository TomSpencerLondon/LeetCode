package com.tomspencerlondon.graphs.educative.challenge4;

import java.util.Set;
import java.util.HashSet;


class CheckMotherVertex {

    public static int findMotherVertex(Graph g){
        Set<Integer> visited = new HashSet<>();

        int lastVertex = 0;

        for (int i = 0; i < g.vertices; i++) {
            if (!visited.contains(i)) {
                dfs(g, visited, i);
                lastVertex = i;
            }
        }

        visited = new HashSet<>();

        dfs(g, visited, lastVertex);

        for (int i = 0; i < g.vertices; i++) {
            if (!visited.contains(i)) {
                return -1;
            }
        }



        return lastVertex;
    }


    public static void dfs(Graph g, Set<Integer> visited, int source) {
        visited.add(source);

        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[source].headNode;

        while (headNode != null) {
            int data = headNode.data;

            if (!visited.contains(data)) {
                dfs(g, visited, data);
            }

            headNode = headNode.nextNode;
        }
    }
}