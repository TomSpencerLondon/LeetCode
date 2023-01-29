package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.tries;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private class Node {
        private char value;
        private Map<Character, Node> children = new HashMap<>();
        private boolean isEndofWord;

        public Node(char value) {
            this.value = value;
        }

        public boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        private void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        private Node getChild(char ch) {
            return children.get(ch);
        }

        public Node[] getChildren() {
            return children.values().toArray(new Node[0]);
        }
    }

    private Node root = new Node(' ');

    public void insert(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch)) {
                current.addChild(ch);
            }
            current = current.getChild(ch);
        }
        current.isEndofWord = true;
    }

    public boolean contains(String word) {
        if (word == null) {
            return false;
        }

        Node current = root;

        for (char ch : word.toCharArray()) {
            if(!current.hasChild(ch)) {
                return false;
            }

            current = current.getChild(ch);
        }

        return current.isEndofWord;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node root) {
        // Pre-order: visit root first

        System.out.println(root.value);
        for (Node child : root.getChildren()) {
            traverse(child);
        }
    }

}
