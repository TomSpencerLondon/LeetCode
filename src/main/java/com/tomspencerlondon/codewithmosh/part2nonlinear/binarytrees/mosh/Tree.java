package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh;

import com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.BinaryTree;

public class Tree {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }
}
