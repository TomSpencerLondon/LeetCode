package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.graphs;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Graph graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "D");
//        graph.addEdge("D", "C");
//        graph.addEdge("A", "C");
//
////        graph.traverseDepthFirst("A");
//        graph.traverseBreadthFirst("A");

        Graph graph = new Graph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");

        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");

        List<String> list = graph.topologicalSort();
        System.out.println(list);
    }
}
