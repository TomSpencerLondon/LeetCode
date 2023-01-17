package com.tomspencerlondon.codewithmosh.stacks.stack;

import java.util.Arrays;

public class Stack {
    // Stack
    // push
    // pop
    // peek
    // isEmpty
    // int[]

    private int[] items;
    private final int size;
    private int top;

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.items = new int[size];
    }

    public void push(int data) {
        if (top > size - 2) {
            throw new StackOverflowError();
        }

        items[++top] = data;
    }

    public int pop() {
        if (top < 0) {
           throw new IllegalStateException();
        }

        return items[top--];
    }

    public int peek() {
        if (top < 0) {
            throw new IllegalStateException();
        }

        return items[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
