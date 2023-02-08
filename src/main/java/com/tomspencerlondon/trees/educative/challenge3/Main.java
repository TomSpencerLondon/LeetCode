package com.tomspencerlondon.trees.educative.challenge3;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
		/* Construct a binary tree like this
				6
			   / \
			  4   9
			 / \  |  \
			2	5 8	  12
					  / \
					 10  14
		*/
        tree.add(6);
        tree.add(4);
        tree.add(9);
        tree.add(2);
        tree.add(5);
        tree.add(8);
        tree.add(8);
        tree.add(12);
        tree.add(10);
        tree.add(14);

        int key = 10;
        System.out.print(key + " --> ");
        System.out.print(findAncestors(tree.getRoot(), key));
    }

    public static String findAncestors(Node root, int k) {

        StringBuilder result = new StringBuilder();
        Node currentNode = root;
        while (currentNode != null && currentNode.getData() != k) {
            result.append(currentNode.getData() + ", ");
            if (k <= currentNode.getData()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }

        if (currentNode == null) {
            return "";
        }

        return result.toString();
    }
}
