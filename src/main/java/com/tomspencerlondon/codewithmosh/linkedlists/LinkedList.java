package com.tomspencerlondon.codewithmosh.linkedlists;

public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int data) {
        Node temp = first;
        this.first = new Node(data);
        first.nextNode = temp;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            this.first = newNode;
            this.last = newNode;
            return;
        }

        Node current = first;
        Node prev = null;
        while (current != null) {
            prev = current;
            current = current.nextNode;
        }

        prev.nextNode = newNode;
        this.last = newNode;
    }

    public void deleteFirst() {
        first = first.nextNode;
    }

    public void deleteLast() {
        Node secondLast = first;
        while (secondLast.nextNode.nextNode != null) {
            secondLast = secondLast.nextNode;
        }

        secondLast.nextNode = null;
    }

    public boolean contains(int data) {
        Node current = first;

        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.nextNode;
        }

        return false;
    }

    public int indexOf(int data) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.nextNode;
            index++;
        }

        return -1;
    }

    public void print() {
        Node current = first;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.nextNode;
        }
        System.out.println("null");
    }
    private class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }

}
