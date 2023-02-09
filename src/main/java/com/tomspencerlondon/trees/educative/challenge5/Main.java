package com.tomspencerlondon.trees.educative.challenge5;

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
        System.out.println(findKNodes(bst.getRoot(), 2));
    }

    public static String findKNodes(Node root, int k) {

        StringBuilder result = new StringBuilder();

        result = findK(root, k, result);

        return result.toString();

    }

    private static StringBuilder findK(Node root, int k, StringBuilder result) {
        Node current = root;
        if (k == 0) {
            result.append(current.getData() + ", ");
        } else {
            findK(root.getLeftChild(), k - 1, result);
            findK(root.getRightChild(), k - 1, result);
        }

        return result;
    }
}
