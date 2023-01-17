package com.tomspencerlondon.codewithmosh.stacks.stack;

import java.util.Arrays;

public class MinStack {
    // Stack
    // push
    // pop
    // peek
    // isEmpty
    // int[]

    private int[] items;
    private final int size;
    private int top;

    private Stack aux;

    public MinStack(int size) {
        this.top = -1;
        this.size = size;
        this.items = new int[size];
        this.aux = new Stack(size);
    }

    public int min() {
        return this.aux.peek();
    }

    public void push(int data) {
        if (top > size - 2) {
            throw new StackOverflowError();
        }

        items[++top] = data;

        if (aux.isEmpty()) {
            aux.push(data);
        } else {
            if (aux.peek() >= data) {
                aux.push(data);
            }
        }
    }

    public int pop() {
        if (top < 0) {
            throw new IllegalStateException();
        }

        int topElement = items[this.top--];

        if (topElement == aux.peek()) {
            aux.pop();
        }

        return topElement;
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
        int[] content = Arrays.copyOfRange(items, 0, top + 1);
        return Arrays.toString(content);
    }
}
