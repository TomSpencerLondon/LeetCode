package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.graphs;

import java.util.*;

public class Graph {

    // Graph
    // Node label: String
    // addNode(label)
    // removeNode(label)
    // addEdge(from, to)
    // removeEdge(from, to)
    // print()
    // A is connected with [B, C]
    // B is connected with [A]

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

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        Node fromNode = nodes.get(from);

        if (fromNode == null) {
            throw new IllegalArgumentException();
        }

        Node toNode = nodes.get(to);
        if (toNode == null) {
            throw new IllegalArgumentException();
        }

        adjacencyList.get(fromNode).add(toNode);
//        if undirected add this line
//        adjacencyList.get(toNode).add(fromNode);
    }

    public void print() {
        for (Node source : adjacencyList.keySet()) {
            List<Node> targets = adjacencyList.get(source);

            if (!targets.isEmpty()) {
                System.out.println(source + " is connected to " + targets);
            }
        }
    }

    public void removeNode(String label) {
        Node node = nodes.get(label);
        if (node == null) {
            return;
        }

        for (Node n : adjacencyList.keySet()) {
            adjacencyList.get(n).remove(node);
        }

        adjacencyList.remove(node);
        nodes.remove(node);
    }

    public void removeEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode == null || toNode == null) {
            return;
        }


        adjacencyList.get(fromNode).remove(toNode);
    }

    public List<String> topologicalSort() {
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();

        for (Node node : nodes.values()) {
            topologicalSort(node, visited, stack);
        }

        List<String> sorted = new ArrayList<>();

        while (!stack.isEmpty()) {
            sorted.add(stack.pop().label);
        }

        return sorted;
    }

    public boolean hasCycle() {
        Set<Node> all = new HashSet<>();
        all.addAll(nodes.values());

        Set<Node> visiting = new HashSet<>();
        Set<Node> visited = new HashSet<>();

        while (!all.isEmpty()) {
            Node current = all.iterator().next();

            if (hasCycle(current, all, visiting, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean hasCycle(Node node, Set<Node> all, Set<Node> visiting, Set<Node> visited) {
        all.remove(node);
        visiting.add(node);

        for (Node neighbour : adjacencyList.get(node)) {
            if (visited.contains(neighbour)) {
                continue;
            }

            if (visiting.contains(neighbour)) {
                return true;
            }

            if (hasCycle(neighbour, all, visiting, visited)) {
                return true;
            }

            visiting.remove(node);
            visited.add(node);
        }

        return false;
    }

    private void topologicalSort(Node node, Set<Node> visited, Stack<Node> stack) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);

        for (Node neighbour : adjacencyList.get(node)) {
            topologicalSort(neighbour, visited, stack);
        }

        stack.push(node);
    }

    public void traverseBreadthFirst(String root) {
        Node node = nodes.get(root);
        if (node == null) {
            return;
        }

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (visited.contains(current)) {
                continue;
            }

            System.out.println(current);
            visited.add(current);

            for (Node neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }
        }

    }

    public void traverseDepthFirst(String root) {
        Node node = nodes.get(root);
        if (node == null) {
            return;
        }
        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (visited.contains(current)) {
                continue;
            }

            System.out.println(current);
            visited.add(current);

            for (Node neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    stack.push(neighbour);
                }
            }
        }

//        traverseDepthFirstRec(node, new HashSet<>());
    }

    private void traverseDepthFirstRec(Node root, Set<Node> visited) {
        System.out.println(root);
        visited.add(root);

        for (Node node : adjacencyList.get(root)) {
            if (!visited.contains(node)) {
                traverseDepthFirstRec(node, visited);
            }
        }
    }
}
