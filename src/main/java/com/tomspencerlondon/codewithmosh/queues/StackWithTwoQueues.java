package com.tomspencerlondon.codewithmosh.queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {
    private final int maxSize;
    private int currentSize;
    Queue<Integer> main;
    Queue<Integer> temp;

//    Build a stack using two queues.
//    Implement the following operations and calculate
//    their runtime complexities.
//    -push
//    -pop
//    -peek
//    -size
//    -isEmpty
//    Solution: StackWithTwoQueues


    public StackWithTwoQueues(int maxSize) {
        this.maxSize = maxSize;
        main = new LinkedList<>();
        temp = new LinkedList<>();
        this.currentSize = 0;
    }

    public void push(int data) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        temp.add(data);

        while (!main.isEmpty()) {
            temp.add(main.remove());
        }

        Queue temporary = main;
        this.main = temp;
        this.temp = temporary;

        this.currentSize++;
    }

    public int peek() {
        return main.peek();
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        this.currentSize--;
        return main.remove();
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return this.currentSize;
    }

    private boolean isFull() {
        return currentSize == maxSize;
    }
}
