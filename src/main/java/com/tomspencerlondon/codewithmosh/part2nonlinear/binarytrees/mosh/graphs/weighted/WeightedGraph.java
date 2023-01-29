package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.graphs.weighted;

import com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.graphs.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {

    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "" + label;
        }
    }

    private class Edge {
        private Node from;
        private Node to;

        private int weight;

        public Edge(Node from, Node to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + " => " + to;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Edge>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight) {
        Node fromNode = nodes.get(from);

        if (fromNode == null) {
            throw new IllegalArgumentException();
        }

        Node toNode = nodes.get(to);
        if (toNode == null) {
            throw new IllegalArgumentException();
        }

        adjacencyList.get(fromNode).add(new Edge(fromNode, toNode, weight));
//        if undirected add this line
        adjacencyList.get(toNode).add(new Edge(toNode, fromNode, weight));
    }

    public void print() {
        for (Node source : adjacencyList.keySet()) {
            List<Edge> targets = adjacencyList.get(source);

            if (!targets.isEmpty()) {
                System.out.println(source + " is connected to " + targets);
            }
        }
    }
}
