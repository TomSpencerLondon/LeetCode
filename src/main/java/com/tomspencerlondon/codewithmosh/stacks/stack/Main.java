package com.tomspencerlondon.codewithmosh.stacks.stack;

public class Main {
    public static void main(String[] args) {
        // Stack
        // push
        // pop
        // peek
        // isEmpty
        // int[]

        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());

    }
}
