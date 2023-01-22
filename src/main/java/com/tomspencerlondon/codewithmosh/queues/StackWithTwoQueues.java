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
        main.add(data);
        this.currentSize++;
    }

    public int peek() {
        while (main.size() > 1) {
            temp.add(main.remove());
        }

        this.currentSize--;
        int result = main.peek();

        Queue<Integer> temporary = main;
        main = temp;
        temp = temporary;

        return result;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        while (main.size() > 1) {
            temp.add(main.remove());
        }

        this.currentSize--;
        int result = main.remove();

        Queue<Integer> temporary = main;
        main = temp;
        temp = temporary;

        return result;
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
