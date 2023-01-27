package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.traversal;

import java.util.ArrayList;
import java.util.List;

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
    if (other == null) {
      return false;
    }

    return equals(root, other.root);
  }

  public void swapRoot() {
    Node temp = root.leftChild;
    root.leftChild = root.rightChild;
    root.rightChild = temp;
  }

  public boolean isBinarySearchTree() {
    return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public boolean isBinarySearchTree(Node root, int min, int max) {
    if (root == null) {
      return true;
    }

    if (root.value < min || root.value > max) {
      return false;
    }

    return isBinarySearchTree(root.leftChild, min, root.value - 1) &&
            isBinarySearchTree(root.rightChild, root.value + 1, max);
  }

  public List<Integer> printNodesAtDistance(int distance) {
    ArrayList<Integer> integers = new ArrayList<Integer>();
    printNodesAtDistance(root, distance, integers);

    return integers;
  }

  private void printNodesAtDistance(Node root, int distance, List<Integer> list) {
    if (root == null) {
      return;
    }
    if (distance == 0) {
      list.add(root.value);
      return;
    }

    printNodesAtDistance(root.leftChild, distance - 1, list);
    printNodesAtDistance(root.rightChild, distance - 1, list);
  }

  public void traverseLevelOrder() {
    for (int i = 0; i <= height(); i++) {
      for (var value : getNodesAtDistance(i)) {
        System.out.println(value);
      }
    }
  }

  public int countLeaves() {
    return countLeaves(root);
  }

  private int countLeaves(Node root) {
    if (root == null) {
      return 0;
    }

    if (isLeaf(root)) {
      return 1;
    }

    return countLeaves(root.leftChild) + countLeaves(root.rightChild);
  }

  public boolean contains(int value) {
    return contains(root, value);
  }

  private boolean contains(Node root, int value) {
    if (root == null) {
      return false;
    }

    if (root.value == value) {
      return true;
    }

    return contains(root.leftChild, value) || contains(root.rightChild, value);
  }

  public List<Integer> getNodesAtDistance(int distance) {
    List<Integer> list = new ArrayList<>();
    getNodesAtDistance(root, distance, list);
    return list;
  }

  public int size() {
    return size(root);
  }

  private int size(Node root) {
    if (root == null) {
      return 0;
    }

    if (isLeaf(root)) {
      return 1;
    }

    return 1 + size(root.leftChild) + size(root.rightChild);
  }


  private void getNodesAtDistance(Node root, int distance, List<Integer> list) {
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

  private boolean equals(Node first, Node second) {
    if (first == null && second == null) {
      return true;
    }

    if (first != null && second != null) {
      return first.value == second.value &&
              equals(first.leftChild, second.leftChild) &&
              equals(first.rightChild, second.rightChild);
    }

    return false;
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
