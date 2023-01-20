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

        moveMainToTempStack();

        currentSize--;
        return temp.pop();
    }

    public V peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        moveMainToTempStack();

        currentSize--;
        return temp.peek();
    }

    private void moveMainToTempStack() {
        if (temp.isEmpty()) {
            while (!mainStack.isEmpty()) {
                temp.push(mainStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    @Override
    public String toString() {
        moveMainToTempStack();
        return temp.toString();
    }
}
