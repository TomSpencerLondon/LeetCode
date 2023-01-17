package com.tomspencerlondon.codewithmosh.stacks.stack;

public class MinStackMain {

    public static void main(String[] args) {
        MinStack minStack = new MinStack(5);

        minStack.push(10);
        minStack.push(20);
        minStack.push(30);
        minStack.push(40);
        minStack.push(5);

        minStack.pop();
        System.out.println(minStack.min());
    }
}
