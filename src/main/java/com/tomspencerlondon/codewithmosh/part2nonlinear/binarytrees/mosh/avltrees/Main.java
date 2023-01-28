package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.avltrees;

public class Main {

    public static void main(String[] args) {
        // AVLTree
        // AVLNode
        // insert() - recursion

        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        System.out.println(tree);

    }
}
