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
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        graph.addEdge("D", "A");
        System.out.println(graph.hasCycle());
    }
}
