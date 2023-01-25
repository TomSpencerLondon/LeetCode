package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh;

import com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.BinaryTree;

public class Tree {
    class Node {
        int value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public Node root;

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }

                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }

        return false;
    }
}
