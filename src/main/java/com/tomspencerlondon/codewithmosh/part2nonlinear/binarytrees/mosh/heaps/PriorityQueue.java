package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.heaps;

import java.util.Arrays;

public class PriorityQueue {
    private final int maxSize;
    int[] items;
    private int currentSize;
    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        this.items = new int[maxSize];
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        int currentIndex = currentSize - 1;
        while (currentIndex >= 0) {
            if (item < items[currentIndex]) {
                items[currentIndex + 1] = items[currentIndex];
            } else {
                break;
            }

            currentIndex--;
        }


        items[currentIndex + 1] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return items[--currentSize];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
