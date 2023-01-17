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
        if (isEmpty()) {
            return;
        }
        Node current = first;
        Node prev = null;
        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }

        last = first;
        last.nextNode = null;
        first = prev;
    }

    public void reverseUptoIndex(int index) {
        if (isEmpty()) {
            return;
        }

        Node current = first;
        Node prev = null;
        int count = 0;
        Node secondHalf = first;
        Node prevSecond = null;
        while (secondHalf != null && count <= index + 1) {
            prevSecond = secondHalf;
            secondHalf = secondHalf.nextNode;
            count++;
        }

        count = 0;
        while (current != null && count <= index) {
            Node next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
            count++;
        }

        first = prev;
        Node firstHalf = first;
        Node ultimate = null;
        count = 0;
        while (firstHalf != null && count < index) {
            ultimate = firstHalf;
            firstHalf = firstHalf.nextNode;
        }

        ultimate.nextNode = prevSecond;
    }


    public int kthNodeFromEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        Node current = first;
        Node end = first;
        int count = 0;
        while (count < k - 1) {
            end = end.nextNode;
            if (end == null) {
                throw new IllegalArgumentException();
            }
            count++;
        }

        while (end.nextNode != null) {
            current = current.nextNode;
            end = end.nextNode;
        }

        return current.data;
    }

    public int printMiddle() {
        Node slow = first;
        Node fast = first;

        while (fast.nextNode != null && fast.nextNode.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }

        return slow.data;
    }

    public boolean hasLoop() {
        Node slow = first;
        Node fast = first;

        while (fast.nextNode != null && fast.nextNode.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if (slow.data == fast.data) {
                return true;
            }
        }

        return false;
    }

    public static LinkedList createWithLoop() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        Node node = list.last;

        list.addLast(40);
        list.addLast(50);

        // create loop
        list.last.nextNode = node;

        return list;
    }
}
