package com.tomspencerlondon.codewithmosh.part1linear.queues;

import java.util.Arrays;

public class ArrayQueue<V> {
    // ArrayQueue (ArrayDeque)
    // enqueue
    // dequeue
    // peek
    // isEmpty
    // isFull
    // [10, 20, 30, 40, 0]

    private int front;
    private int back;
    private int maxSize;
    private int currentSize;
    private V[] items;
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.items = (V[]) new Object[maxSize];
        this.front = 0;
        this.back = -1;
        this.currentSize = 0;
    }

    public void enqueue(V data) {
        if (isFull()) {
            return;
        }

        back = (back + 1) % maxSize;
        items[back] = data;
        currentSize++;
    }

    public V dequeue() {
        if (isEmpty()) {
            return null;
        }

        currentSize--;
        V temp = items[front];
        front = (front + 1) % maxSize;

        return temp;
    }

    public V peek() {
        if (isEmpty()) {
            return null;
        }

        return items[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    @Override
    public String toString() {

        V[] printable = (V[]) new Object[currentSize];
        int index = 0;
        for (int i = front; i <= back; i++) {
            printable[index++] = items[i];
        }

        return Arrays.toString(printable);
    }

}
