package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.heaps.heapify;

public class MinHeap {
    private class Node {
        private int key;
        private String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] nodes = new Node[10];
    private int size;

    public void insert(int key, String value) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        nodes[size++] = new Node(key, value);

        bubbleUp();
    }

    public String remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        String root = nodes[0].value;
        nodes[0] = nodes[--size];

        bubbleDown();

        return root;
    }

    private void bubbleDown() {
        int index = 0;
        while (index <= size && !isValidParent(index)) {
            int largerChildIndex = smallerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    private int smallerChildIndex(int index) {
        if (!hasLeftChild(index)) {
            return index;
        }

        if (!hasRightChild(index)) {
            return leftChildIndex(index);
        }

        return (leftChild(index).key < rightChild(index).key) ?
                leftChildIndex(index) :
                rightChildIndex(index);
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    private Node rightChild(int index) {
        return nodes[rightChildIndex(index)];
    }

    private Node leftChild(int index) {
        return nodes[leftChildIndex(index)];
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        }

        boolean isValid = nodes[index].key <= leftChild(index).key;

        if (hasRightChild(index)) {
            isValid &= nodes[index].key <= rightChild(index).key;
        }

        return isValid;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void bubbleUp() {
        int index = size - 1;
        while (index > 0 && nodes[index].key < nodes[parent(index)].key) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void swap(int first, int second) {
        Node temp = nodes[first];
        nodes[first] = nodes[second];
        nodes[second] = temp;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private boolean isFull() {
        return size == nodes.length;
    }




}
