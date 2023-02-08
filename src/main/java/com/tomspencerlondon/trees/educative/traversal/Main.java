package com.tomspencerlondon.trees.educative.traversal;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(2);
        binarySearchTree.add(5);
        binarySearchTree.add(9);
        binarySearchTree.add(8);
        binarySearchTree.add(12);

        preTraverse(binarySearchTree.getRoot());
        System.out.println("----");
        inOrderTraverse(binarySearchTree.getRoot());
        System.out.println("----");
        postTraverse(binarySearchTree.getRoot());
    }

    private static void preTraverse(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getData() + ", ");

        preTraverse(root.getLeftChild());
        preTraverse(root.getRightChild());
    }

    private static void postTraverse(Node root) {
        if (root == null) {
            return;
        }


        postTraverse(root.getLeftChild());
        postTraverse(root.getRightChild());
        System.out.print(root.getData() + ", ");
    }

    private static void inOrderTraverse(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraverse(root.getLeftChild());
        System.out.print(root.getData() + ", ");
        inOrderTraverse(root.getRightChild());
    }
}
