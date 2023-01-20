package com.tomspencerlondon.codewithmosh.queues.mosh;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int capacity;
    private int rear;

    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        rear = (rear + 1) % capacity;
        items[rear] = item; // 5 [0 - 4]

        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return items[front];
    }

    public boolean isFull() {
        return count == items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
