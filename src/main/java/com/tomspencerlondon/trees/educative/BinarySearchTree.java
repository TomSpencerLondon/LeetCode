package com.tomspencerlondon.trees.educative;

public class BinarySearchTree {
    private Node root;
    private int COUNT = 10;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(int value) {
        if (isEmpty()) {
            root = new Node(value);
            return true;
        }

        Node currentNode = root;

        while (currentNode != null) {
            Node leftChild = currentNode.getLeftChild();
            Node rightChild = currentNode.getRightChild();

            if (currentNode.getData() > value) {
                if (leftChild == null) {
                    leftChild = new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }
                currentNode = leftChild;
            } else {
                if (rightChild == null) {
                    rightChild = new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }

                currentNode = rightChild;
            }
        }

        return false;
    }

    public void printTree(Node current) {
        printTree(current, 0);
    }

    private void printTree(Node root, int space) {
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
