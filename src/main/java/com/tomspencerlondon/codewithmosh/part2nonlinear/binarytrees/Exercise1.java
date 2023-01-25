package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees;

import java.io.PrintStream;

public class Exercise1 {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.add(10);
        tree.add(2);
        tree.add(1);
        print(new PrintStream(System.out), tree.root);
    }

    public static void print(PrintStream os, BinaryTree.Node node) {
        os.print(traversePreOrder(node));
    }

    public static String traversePreOrder(BinaryTree.Node root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.value);
        String pointerRight = "└──";
        String pointerLeft = (root.right != null) ? "├──" : "└──";
        traverseNodes(sb, "", pointerLeft, root.left, root.right != null);
        traverseNodes(sb, "", pointerRight, root.right, false);

        return sb.toString();
    }

    private static void traverseNodes(StringBuilder sb, String padding, String pointer, BinaryTree.Node node, boolean hasRightSibling) {
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
            String pointerLeft = (node.right != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);

        }
    }
}