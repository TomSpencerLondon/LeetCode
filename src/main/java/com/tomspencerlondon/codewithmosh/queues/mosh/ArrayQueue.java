package com.tomspencerlondon.codewithmosh.queues.mosh;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;

    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        this.items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length) {
            throw new IllegalStateException();
        }

        items[rear++] = item; // 5 [0 - 4]

        count++;
    }

    public int dequeue() {
        int item = items[front];
        items[front] = 0;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
