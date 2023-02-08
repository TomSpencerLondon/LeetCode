package com.tomspencerlondon.trees.educative.deletion;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(6);
        binarySearchTree.add(7);
        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(1);
        binarySearchTree.add(15);

        System.out.println("Tree: ");
        binarySearchTree.printTree(binarySearchTree.getRoot());

        System.out.println("\nDeleting Node 6: ");
        binarySearchTree.delete(6, binarySearchTree.getRoot());
        System.out.println();
        binarySearchTree.printTree(binarySearchTree.getRoot());

        System.out.println("\nDeleting Node 15: ");
        binarySearchTree.delete(15, binarySearchTree.getRoot());
        System.out.println();
        binarySearchTree.printTree(binarySearchTree.getRoot());

        System.out.println("\nDeleting Node 1: ");
        binarySearchTree.delete(1, binarySearchTree.getRoot());
        System.out.println();
        binarySearchTree.printTree(binarySearchTree.getRoot());
    }
}
