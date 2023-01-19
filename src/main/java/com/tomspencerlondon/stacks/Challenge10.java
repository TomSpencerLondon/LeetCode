package com.tomspencerlondon.stacks;

public class Challenge10 {
    public static void main(String[] args) {
        // Challenge 10: Create Stack where min() gives minimum in 0(1)

        MinStack stack = new MinStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.min());
    }


    private static class MinStack {
        int maxSize;
        Stack<Integer> mainStack;
        Stack<Integer> minStack;

        public MinStack(int maxSize) {
            this.maxSize = maxSize;
            this.mainStack = new Stack<>(maxSize);
            this.minStack = new Stack<>(maxSize);
        }

        public int pop() {
            minStack.pop();

            return mainStack.pop();
        }

        public void push(Integer value) {
            mainStack.push(value);

            if (!minStack.isEmpty() && minStack.top() < value) {
                minStack.push(minStack.top());
            } else {
                minStack.push(value);
            }
        }

        public int min() {
            return minStack.top();
        }
    }
}
