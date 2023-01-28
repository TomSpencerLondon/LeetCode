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
    private int balanceFactor;

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

        balanceFactor = balanceFactor(root);

        if (isLeftHeavy(root)) {
            System.out.println(root.value + " is left heavy");
        } else if (isRightHeavy(root)) {
            System.out.println(root.value + " is right heavy");
        }

        return root;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.leftChild);
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }
}
