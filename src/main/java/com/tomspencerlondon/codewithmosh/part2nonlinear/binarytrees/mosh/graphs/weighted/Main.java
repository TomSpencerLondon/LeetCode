package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.graphs.weighted;

public class Main {

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "D", 5);
        graph.addEdge("A", "C", 1);
        graph.addEdge("B", "C", 2);

        graph.getMinimumSpanningTree().print();
    }
}
