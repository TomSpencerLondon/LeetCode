package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.avltrees;

import com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.traversal.Tree;

public class AVLTree {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.leftChild = insert(root.leftChild, value);
        } else {
            root.rightChild = insert(root.rightChild, value);
        }

        return root;
    }
}
