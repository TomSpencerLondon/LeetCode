package com.tomspencerlondon.codewithmosh.part1linear.queues;
public class LinkedListQueue {
    //    Build a queue using a linked list from scratch.
//    Implement the following operations and calculate their runtime
//    complexities.
//    -enqueue
//    -dequeue
//    -peek
//    -size
//    -isEmpty

    private Node rear;
    private Node front;

    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public Node peek() {
        Node result = null;
        if (!isEmpty()) {
            result = new Node(front.getData());
        }

        return result;
    }

    public int getSize() {
        return size;
    }

    public int dequeue() {
        Node result = null;
        if (front  != null) {
            if (front.getNext() != null) {
                result = new Node(front.getData());
                front = front.getNext();
            } else {
                result = new Node(front.getData());
                front = null;
                rear = null;
            }
        }

        size--;
        return result.data;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (front == null) {
            rear = node;
            front = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + this.data;
        }
    }
}
