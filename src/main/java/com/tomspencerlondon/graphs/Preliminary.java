package com.tomspencerlondon.graphs;


import java.util.LinkedList;

public class Preliminary {

    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        System.out.println(bfs(graph));
    }

    public static String bfs(Graph g) {
        StringBuilder result = new StringBuilder();
        int startPosition = 0;
        result.append(startPosition);
        int count = g.adjacencyList.length;
        bfsAux(g, result, count, 0);
        return result.toString();
    }

    private static void bfsAux(Graph g, StringBuilder result, int count, int current) {
        if (current == count) {
            return;
        }

        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[current].headNode;
        while (headNode != null) {
            result.append(headNode.data);
            headNode = headNode.nextNode;
        }

        bfsAux(g, result, count, current + 1);
    }
}
