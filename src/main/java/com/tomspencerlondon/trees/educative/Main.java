package com.tomspencerlondon.trees.educative;

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

//        System.out.println(binarySearchTree.getRoot().getData());

        binarySearchTree.printTree(binarySearchTree.getRoot());
    }
}
