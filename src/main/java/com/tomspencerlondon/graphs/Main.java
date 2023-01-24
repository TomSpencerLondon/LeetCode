package com.tomspencerlondon.graphs;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        Challenge 1: Implement Breadth First Search
//In this lesson, you have to implement the Breadth First
// Search algorithm discussed in the previous lesson.
// A solution is placed in the "solution" section to help you,
// but we would suggest trying to solve it on your own first.

//        Input#
//A graph in the form of an adjacency list
//
//Output
//A string containing the vertices of the graph
// listed in the correct order of traversal.
        Graph graph = new Graph(8);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);

        graph.printGraph();
        System.out.println(bfs(graph));
    }

    public static String bfs(Graph g) {
        // 0,1,2,3,4

        StringBuilder result = new StringBuilder();

        int startPosition = 0;
        // Add level zero
        result.append(startPosition);

        // Add level one
        addLevelToString(g, result, startPosition);

        // Add level two

        addChildrenOfLevelToString(g, result, startPosition);

//        // Add level three
        addChildrenOfChildrenOfLevelToString(g, result, startPosition);

        // Write - Your - Code

        return result.toString();
    }

    private static void addChildrenOfChildrenOfLevelToString(Graph g, StringBuilder result, int startPosition) {
        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[startPosition].headNode;

        while (headNode != null) {
            addChildrenOfLevelToString(g, result, headNode.data);
            headNode = headNode.nextNode;
        }
    }

    private static void addChildrenOfLevelToString(Graph g, StringBuilder result, int startPosition) {
        DoublyLinkedList<Integer>.Node headNode1 = g.adjacencyList[startPosition].headNode;
        while (headNode1 != null) {
            addLevelToString(g, result, headNode1.data);
            headNode1 = headNode1.nextNode;
        }
    }

    private static void addLevelToString(Graph g, StringBuilder result, int startPosition) {
        DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[startPosition].headNode;
        while (headNode != null) {
            result.append(headNode.data);
            headNode = headNode.nextNode;
        }
    }
}
