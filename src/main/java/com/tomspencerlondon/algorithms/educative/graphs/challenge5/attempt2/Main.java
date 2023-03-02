package com.tomspencerlondon.algorithms.educative.graphs.challenge5.attempt2;


import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);

        System.out.println("------");
        System.out.println(countPaths(graph, 0, 5));
        System.out.println("------");

        Graph graph2 = new Graph(7);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(1, 5);
        graph2.addEdge(2, 3);
        graph2.addEdge(2, 4);
        graph2.addEdge(5, 3);
        graph2.addEdge(5, 6);
        graph2.addEdge(3, 6);

        System.out.println(countPaths(graph2, 0, 3));

    }

    private static int countPaths(Graph graph, int start, int destination) {
        return countPathsRecursive(graph, start, destination);
    }

//    private static int countPathsNonRecursive(Graph graph, int start, int destination) {
//        int count = 0;
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(start);
//
//        while (!stack.isEmpty()) {
//            Integer pop = stack.pop();
//        }
//    }

    private static int countPathsRecursive(Graph graph, int start, int destination) {
        LinkedList<Integer>[] linkedLists = graph.getAdj();
        int count = 0;

        if (start == destination) {
            count = 1;
        } else {
            for (int i = 0; i < linkedLists[start].size(); i++) {
                int adjacentVertex = linkedLists[start].get(i);

                count += countPathsRecursive(graph, adjacentVertex, destination);
            }
        }

        return count;
    }
}
