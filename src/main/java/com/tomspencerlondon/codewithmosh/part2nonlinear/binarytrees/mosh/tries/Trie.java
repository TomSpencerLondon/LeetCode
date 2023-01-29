package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        public boolean hasChildren() {
            return !children.isEmpty();
        }

        public void removeChild(char ch) {
            children.remove(ch);
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

    public void remove(String word) {
        if (word == null) {
            return;
        }
        remove(root, word, 0);
    }

    private void remove(Node root, String word, int index) {
        if (index == word.length()) {
            root.isEndofWord = false;
            return;
        }

        char ch = word.charAt(index);
        Node child = root.getChild(ch);
        if (child == null) {
            return;
        }

        remove(child, word, index + 1);

        if (!child.hasChildren() && !child.isEndofWord) {
            root.removeChild(ch);
        }
    }

    public List<String> findWords(String prefix) {
        List<String> words = new ArrayList<>();
        Node lastNode = findLastNodeOf(prefix);

        findWords(lastNode, prefix, words);

        return words;
    }

    private void findWords(Node root, String prefix, List<String> words) {
        if (root == null) {
            return;
        }
        if (root.isEndofWord) {
            words.add(prefix);
        }

        for (Node child : root.getChildren()) {
            findWords(child, prefix + child.value, words);
        }
    }

    private Node findLastNodeOf(String prefix) {
        if (prefix == null) {
            return null;
        }
        Node current = root;
        for (char ch : prefix.toCharArray()) {
            Node child = current.getChild(ch);

            if (child == null) {
                return null;
            }

            current = child;
        }

        return current;
    }

    public boolean containsRecursive(String word) {
        if (word == null) {
            return false;
        }

        return containsRecursive(root, word, 0);
    }

    private boolean containsRecursive(Node root, String word, int index) {
        if (index == word.length()) {
            return root.isEndofWord;
        }

        if (root == null) {
            return false;
        }

        char ch = word.charAt(index);
        Node child = root.getChild(ch);

        if (child == null) {
            return false;
        }

        return containsRecursive(child, word, index + 1);
    }
}
