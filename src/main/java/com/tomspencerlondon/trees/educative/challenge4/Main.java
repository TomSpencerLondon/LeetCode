package com.tomspencerlondon.trees.educative.challenge4;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(6);
        bst.add(4);
        bst.add(9);
        bst.add(5);
        bst.add(2);
        bst.add(8);
        bst.add(12);

        bst.printTree(bst.getRoot());

        System.out.println(findHeight(bst.getRoot()));
    }

    public static int findHeight(Node root) {
        if (root == null) {
            return -1;
        }

        return 1 + Math.max(findHeight(root.getLeftChild()), findHeight(root.getRightChild()));
    }
}