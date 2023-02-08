package com.tomspencerlondon.trees.educative.challenge2;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(8);

        System.out.println(findKthMax(binarySearchTree.getRoot(), 3));
    }

    public static int findKthMax(Node root, int k) {
        StringBuilder result = new StringBuilder();

        result = inOrderTraversal(root, result);

        String[] array = result.toString().split(",");

        if ((array.length - k) >= 0) {
            return Integer.parseInt(array[array.length - k]);
        } else {
            return -1;
        }
    }

    private static StringBuilder inOrderTraversal(Node root, StringBuilder result) {
        if (root == null) {
            return result;
        }

        inOrderTraversal(root.getLeftChild(), result);
        result.append(root.getData() + ",");
        inOrderTraversal(root.getRightChild(), result);

        return result;
    }
}
