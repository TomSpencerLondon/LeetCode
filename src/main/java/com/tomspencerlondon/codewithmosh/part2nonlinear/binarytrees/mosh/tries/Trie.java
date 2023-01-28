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
            return children.get(ch) == null;
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

}
