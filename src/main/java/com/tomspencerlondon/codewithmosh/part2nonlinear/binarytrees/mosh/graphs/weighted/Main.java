package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.graphs.weighted;

public class Main {

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B", 1);
        graph.addEdge("B", "C", 2);
        graph.addEdge("C", "A", 2);

        System.out.println(graph.hasCycle());
    }
}
