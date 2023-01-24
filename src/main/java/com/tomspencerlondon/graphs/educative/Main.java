package com.tomspencerlondon.graphs.educative;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(17);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(2, 12);
        graph.addEdge(2, 14);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 8);
        graph.addEdge(4, 9);
        graph.addEdge(7, 10);
        graph.addEdge(5, 15);
        graph.addEdge(9, 16);
        graph.printGraph();
        System.out.println(bfs(graph));
    }

    public static String bfs(Graph g) {
        Queue queue = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        int startPosition = 0;
        queue.add(startPosition);
        bfsAux(g, queue, result);
        return result.toString();
    }

    private static void bfsAux(Graph g, Queue queue, StringBuilder result) {
        if (queue.isEmpty()) {
            return;
        }

        int current = (Integer) queue.poll();
        result.append(current + " ");
        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[current].headNode;
        while (headNode != null) {
            queue.add(headNode.data);
            headNode = headNode.nextNode;
        }

        bfsAux(g, queue, result);
    }
}
