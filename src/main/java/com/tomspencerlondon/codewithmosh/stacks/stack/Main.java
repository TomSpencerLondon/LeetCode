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

        TwoStack twoStack = new TwoStack(4);

        twoStack.push1(1);
        twoStack.push1(2);
        twoStack.push1(3);
        twoStack.push2(1);

        System.out.println(twoStack.pop1());
        System.out.println(twoStack.pop2());

        System.out.println(twoStack.pop1());
        twoStack.push2(2);

        System.out.println(twoStack.pop2());

    }
}
