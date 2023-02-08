package com.tomspencerlondon.trees.educative.deletion;

public class BinarySearchTree {

    private static final int COUNT = 10;
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    // 3 conditions for delete
    // 1. Node is leaf node
    // 2. Node has 1 child
    // 3. Node has 2 children
    public boolean delete(int value, Node currentNode) {
        if (root == null) {
            return false;
        }

        Node parent = null; //To Store parent of currentNode
        while(currentNode != null && (currentNode.getData() != value)) {
            parent = currentNode;
            if (currentNode.getData() > value)
                currentNode = currentNode.getLeftChild();
            else
                currentNode = currentNode.getRightChild();

        }

        if(currentNode == null) {
            return false;
        } else if(currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            //1. Node is Leaf Node
            //if that leaf node is the root (a tree with just root)
            if(root.getData() == currentNode.getData()){
                setRoot(null);
                return true;
            }
            else if(currentNode.getData() < parent.getData()){
                parent.setLeftChild(null);
                return true;
            }
            else{
                parent.setRightChild(null);
                return true;
            }
        } else if(currentNode.getRightChild() == null) {

            if(root.getData() == currentNode.getData()){
                setRoot(currentNode.getLeftChild());
                return true;
            }
            else if(currentNode.getData() < parent.getData()){
                parent.setLeftChild(currentNode.getLeftChild());
                return true;
            }
            else{

                parent.setRightChild(currentNode.getLeftChild());
                return true;
            }

        } else if(currentNode.getLeftChild() == null) {

            if(root.getData() == currentNode.getData()){
                setRoot(currentNode.getRightChild());
                return true;
            }
            else if(currentNode.getData() < parent.getData()){
                parent.setLeftChild(currentNode.getRightChild());
                return true;
            }
            else{
                parent.setRightChild(currentNode.getRightChild());
                return true;
            }

        } else {
            //Find Least Value Node in right-subtree of current Node
            Node leastNode = findLeastNode(currentNode.getRightChild());
            //Set CurrentNode's Data to the least value in its right-subtree
            int temp = leastNode.getData();
            delete(temp, root);
            currentNode.setData(temp);
            //Delete the leafNode which had the least value
            return true;
        }
    }

    private Node findLeastNode(Node currentNode) {
        Node temp = currentNode;
        while (temp.getLeftChild() != null) {
            temp = temp.getLeftChild();
        }

        return temp;
    }

    public boolean add(int value) {
        if (isEmpty()) {
            root = new Node(value);
            return true;
        }

        Node currentNode = root;

        while (currentNode != null) {
            Node leftChild = currentNode.getLeftChild();
            Node rightChild = currentNode.getRightChild();

            if (currentNode.getData() > value) {
                if (leftChild == null) {
                    leftChild = new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }

                currentNode = leftChild;
            } else {
                if (rightChild == null) {
                    rightChild = new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }

                currentNode = rightChild;
            }
        }

        return false;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void printTree(Node current) {
        printTree(current, 0);
    }

    private void printTree(Node root, int space) {
        if (root == null) {
            return;
        }

        space += COUNT;

        printTree(root.getRightChild(), space);

        System.out.print("\n");

        for (int i = COUNT; i < space; i++) {
            System.out.print(" ");
        }

        System.out.print(root.getData() + "\n");

        printTree(root.getLeftChild(), space);
    }

}
