package com.tomspencerlondon.trees.educative.challenge5;

public class BinarySearchTree {

    private static final int COUNT = 10;
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node recursiveInsert(Node currentNode, int value) {

        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.getData()) {
            currentNode.setLeftChild(recursiveInsert(currentNode.getLeftChild(), value));
        } else if (value > currentNode.getData()) {
            currentNode.setRightChild(recursiveInsert(currentNode.getRightChild(), value));
        } else {
            return currentNode;
        }

        return currentNode;
    }

    public boolean add(int value) {
        root = recursiveInsert(this.root, value);
        return true;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void printTree(Node current) {
        printTree(current, 0);
    }

    public void printTree(Node root, int space) {
        if (root == null) {
            return;
        }

        space += COUNT;

        printTree(root.getRightChild(), space);

        System.out.print("\n");

        for (int i = COUNT; i < space; i++) {
            System.out.print(" ");
        }

        System.out.print(root.getData() + "\n");

        printTree(root.getLeftChild(), space);
    }
}
