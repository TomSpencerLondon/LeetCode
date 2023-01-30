package com.tomspencerlondon.graphs.educative.challenge4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 0);
        graph.addEdge(3, 1);

        System.out.println(findMotherVertex(graph));
    }


    public static int findMotherVertex(Graph g){
        boolean[] visited = new boolean[g.vertices];
        int lastVertex = 0;

        for (int i = 0; i < g.vertices; i++) {
            if (!visited[i]) {
                dfs(g, visited, i);
                lastVertex = i;
            }
        }

        Arrays.fill(visited, false);

        dfs(g, visited, lastVertex);

        for (boolean hasVisited : visited) {
            if (!hasVisited) {
                return -1;
            }
        }

        return lastVertex;
    }

    private static void dfs(Graph g, boolean[] visited, int source) {
        visited[source] = true;

        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[source].headNode;

        while (headNode != null) {
            Integer data = headNode.data;
            if (!visited[data]) {
                dfs(g, visited, data);
            }
        }
    }
}
