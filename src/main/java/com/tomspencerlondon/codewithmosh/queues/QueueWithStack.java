package com.tomspencerlondon.codewithmosh.queues;

import java.util.Stack;

public class QueueWithStack<V> {
    private final int maxSize;
    private Stack<V> mainStack;
    private Stack<V> temp;

    private int currentSize;

    public QueueWithStack(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.mainStack = new Stack<>();
        this.temp = new Stack<>();
    }

    public void enqueue(V data) {
        currentSize++;
        mainStack.push(data);
    }

    public V dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        while (!mainStack.isEmpty()) {
            temp.push(mainStack.pop());
        }

        V item = temp.pop();

        while (!temp.isEmpty()) {
            mainStack.push(temp.pop());
        }

        currentSize--;
        return item;
    }

    public V peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        while (!mainStack.isEmpty()) {
            temp.push(mainStack.pop());
        }

        V item = temp.peek();

        while (!temp.isEmpty()) {
            mainStack.push(temp.pop());
        }

        currentSize--;
        return item;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    @Override
    public String toString() {
        return mainStack.toString();
    }
}
