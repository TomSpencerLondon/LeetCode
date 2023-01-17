package com.tomspencerlondon.stacks;

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
        sortStack(stack);

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
}
