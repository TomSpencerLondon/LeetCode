package com.tomspencerlondon.codewithmosh.linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    int size;

    public void addFirst(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.nextNode = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            this.first = newNode;
            this.last = newNode;
            size++;
            return;
        }

        if (last != null) {
            last.nextNode = newNode;
        }

        last = newNode;
        size++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        Node second = first.nextNode;
        first.nextNode = null;
        first = second;
        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            size--;
            return;
        }

        Node previous = getPrevious();
        last = previous;
        last.nextNode = null;
        size--;
    }

    private Node getPrevious() {
        Node current = first;

        while (current != null) {
            if (current.nextNode == last) {
                return current;
            }
            current = current.nextNode;
        }
        return null;
    }

    public boolean contains(int data) {
        return indexOf(data) != -1;
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

    public int size() {
        return this.size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.nextNode;
        }

        return array;
    }

    public void reverse() {
        Node current = first;
        Node prev = null;
        last = first;
        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }

        first = prev;
    }

}
