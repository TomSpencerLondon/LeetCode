package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.traversal;

public class Main {
    public static void main(String[] args) {
        // equals(Tree): boolean
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        tree.traversePreOrder();
        System.out.println("---");
        tree.traversePostOrder();
        System.out.println("---");
        tree.traverseInOrder();

        System.out.println("---");
        System.out.println(tree.height());
        System.out.println("---");
        System.out.println(tree.min());

        System.out.println("----");
        System.out.println(tree.equals(tree2));

        tree2.swapRoot();
        System.out.println(tree2.isBinarySearchTree());
    }
}

