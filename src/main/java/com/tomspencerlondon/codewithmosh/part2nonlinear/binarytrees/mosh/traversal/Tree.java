package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.traversal;

public class Tree {
  private class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Node=" + value;
    }
  }

  private Node root;

  public void insert(int value) {
    var node = new Node(value);

    if (root == null) {
      root = node;
      return;
    }

    var current = root;
    while (true) {
      if (value < current.value) {
        if (current.leftChild == null) {
          current.leftChild = node;
          break;
        }
        current = current.leftChild;
      }
      else {
        if (current.rightChild == null) {
          current.rightChild = node;
          break;
        }
        current = current.rightChild;
      }
    }
  }

  public boolean find(int value) {
    var current = root;
    while (current != null) {
      if (value < current.value)
        current = current.leftChild;
      else if (value > current.value)
        current = current.rightChild;
      else
        return true;
    }
    return false;
  }

  public void traversePreOrder() {
    traversePreOrder(root);
  }

  private void traversePreOrder(Node root) {
    // root (print)
    // left
    // right

    if (root == null) {
      return;
    }

    System.out.println(root.value);
    traversePreOrder(root.leftChild);
    traversePreOrder(root.rightChild);
  }

  public void traversePostOrder() {
    traversePostOrder(root);
  }

  private void traversePostOrder(Node root) {
    // left
    // right
    // root (print)

    if (root == null) {
      return;
    }

    traversePostOrder(root.leftChild);
    traversePostOrder(root.rightChild);
    System.out.println(root.value);
  }

  public void traverseInOrder() {
    traverseInOrder(root);
  }

  private void traverseInOrder(Node root) {
    // left
    // root (print)
    // right

    if (root == null) {
      return;
    }

    traverseInOrder(root.leftChild);
    System.out.println(root.value);
    traverseInOrder(root.rightChild);
  }

  public int height() {
    return height(root);
  }

  public int height(Node root) {
    if (root == null) {
      return -1;
    }
    if (isLeaf(root)) {
      return 0;
    }

    return 1 + Math.max(height(root.leftChild), height(root.rightChild));
  }

  // O(log n)
  public int min() {
    if (root == null) {
      throw new IllegalStateException();
    }

    Node current = root;
    Node last = current;
    while (current != null) {
      last = current;
      current = current.leftChild;
    }
    return last.value;
  }

  public boolean equals(Tree other) {
    return equals(root, other.root);
  }

  private boolean equals(Node first, Node second) {
    if (first == null && second == null) {
      return true;
    }
    if (first.value != second.value) {
      return false;
    }

    return equals(first.leftChild, second.leftChild) &&
            equals(first.rightChild, second.rightChild);
  }

  // O(n)
  private int min(Node root) {
    if (isLeaf(root)) {
      return root.value;
    }

    int left = min(root.leftChild);
    int right = min(root.rightChild);

    return Math.min(root.value, Math.min(left, right));
  }

  private static boolean isLeaf(Node root) {
    return root.leftChild == null && root.rightChild == null;
  }

}
