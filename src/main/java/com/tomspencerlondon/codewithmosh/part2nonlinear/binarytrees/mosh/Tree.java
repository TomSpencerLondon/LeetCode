package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh;

import com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.BinaryTree;

import java.util.ArrayList;

public class Tree {
    class Node {
        int value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public Node root;

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }

                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }

        return false;
    }

    public void traverseLevelOrder() {
        for (int i = 0; i <= height(); i++) {
            for (Integer value : getNodesAtDistance(i)) {
                System.out.println(value);
            }
        }
    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        ArrayList<Integer> list = new ArrayList<>();
        getNodesAtDistance(root, distance, list);

        return list;
    }

    public void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        if (distance == 0) {
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.leftChild, distance - 1, list);
        getNodesAtDistance(root.rightChild, distance - 1, list);
    }

    public int height() {
        return height(root);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }

        if (isLeaf(root)) {
            return 0;
        }

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild)
        );
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null &&
                node.rightChild == null;
    }
}
