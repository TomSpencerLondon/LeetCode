package com.tomspencerlondon.codewithmosh.part1linear.stacks.stack;

public class TwoStack {
    int[] items;
    int top1;
    int top2;

    public TwoStack(int size) {
        this.items = new int[size];
        this.top1 = -1;
        this.top2 = items.length;
    }

    public void push1(int data) {
        if (top1 >= top2 - 1) {
            throw new StackOverflowError();
        }

        items[++top1] = data;
    }

    public void push2(int data) {
        if (top1 >= top2 - 1) {
            throw new StackOverflowError();
        }

        items[--top2] = data;
    }

    public int pop1() {
        if (top1 < 0) {
            throw new IllegalStateException();
        }

        return items[top1--];
    }

    public int pop2() {
        if (top2 > items.length - 1) {
            throw new IllegalStateException();
        }

        return items[top2++];
    }

    public boolean isEmpty1() {
        return top1 < 0;
    }

    public boolean isEmpty2() {
        return top2 > items.length;
    }

    public boolean isFull1() {
        return top1 >= top2;
    }

    public boolean isFull2() {
        return top2 <= top1;
    }
}
