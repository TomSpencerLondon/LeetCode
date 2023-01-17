package com.tomspencerlondon.stacks;

import com.tomspencerlondon.sedgewick.In;

public class Challenge5 {
    // Sort values in a Stack

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);

        System.out.println(stack);
        sortStackRecursive(stack);

        System.out.println(stack);

    }

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>(stack.getMaxSize());

        while (!stack.isEmpty()) {
            int tmp = stack.pop();

            while (!temp.isEmpty() && temp.top() > tmp) {
                stack.push(temp.pop());
            }

            temp.push(tmp);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static Stack<Integer> sortStackRecursive(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int value = stack.pop();
            sortStackRecursive(stack);
            insert(stack, value);
        }

        return stack;
    }

    public static void insert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.top() > value) {
            stack.push(value);
        } else {
            int tmp = stack.pop();
            insert(stack, value);
            stack.push(tmp);
        }
    }
}
