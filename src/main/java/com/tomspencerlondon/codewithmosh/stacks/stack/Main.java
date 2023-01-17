package com.tomspencerlondon.codewithmosh.stacks.stack;

public class Main {
    public static void main(String[] args) {
        // Stack
        // push
        // pop
        // peek
        // isEmpty
        // int[]

        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.isEmpty());

    }
}
