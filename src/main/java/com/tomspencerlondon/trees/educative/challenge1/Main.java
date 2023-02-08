package com.tomspencerlondon.trees.educative.challenge1;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(10);
        binarySearchTree.add(14);

        System.out.println(findMinRecursive(binarySearchTree.getRoot()));
    }

    private static int findMin(Node root) {
        if (root == null) {
            return -1;
        }

        while (root.getLeftChild() != null) {
            root = root.getLeftChild();
        }

        return root.getData();
    }

    private static int findMinRecursive(Node root) {
        if (root == null) {
            return -1;
        }else if (root.getLeftChild() == null) {
            return root.getData();
        } else {
            return findMinRecursive(root.getLeftChild());
        }
    }


}
