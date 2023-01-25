package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh;

import com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.BinaryTree;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        print(new PrintStream(System.out), tree.root);

    }

    public static void print(PrintStream os, Tree.Node node) {
        os.print(traversePreOrder(node));
    }

    public static String traversePreOrder(Tree.Node root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.value);
        String pointerRight = "└──";
        String pointerLeft = (root.rightChild != null) ? "├──" : "└──";
        traverseNodes(sb, "", pointerLeft, root.leftChild, root.rightChild != null);
        traverseNodes(sb, "", pointerRight, root.rightChild, false);

        return sb.toString();
    }

    private static void traverseNodes(StringBuilder sb, String padding, String pointer, Tree.Node node, boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.value);

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.rightChild != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.leftChild, node.rightChild != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.rightChild, false);

        }
    }
}
