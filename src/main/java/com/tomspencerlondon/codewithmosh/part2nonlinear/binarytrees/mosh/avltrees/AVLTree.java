package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.avltrees;

public class AVLTree {

    private class AVLNode {
        private int value;
        private int height;

        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null) {
            return new AVLNode(value);
        }

        if (value < root.value) {
            root.leftChild = insert(root.leftChild, value);
        } else {
            root.rightChild = insert(root.rightChild, value);
        }

        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;

        return root;
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }
}
