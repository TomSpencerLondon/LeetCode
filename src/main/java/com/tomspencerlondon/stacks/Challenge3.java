package com.tomspencerlondon.stacks;

import com.tomspencerlondon.sedgewick.In;

public class Challenge3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        Queue<Integer> result = reverseFirst(queue, 5);
        System.out.println(result);
    }

    public static Queue<Integer> reverseFirst(Queue<Integer> queue, int n) {
        Queue<Integer> result = new Queue<>(queue.getCurrentSize());
        Stack<Integer> stack = new Stack<>(queue.getCurrentSize());

        for (int i = 0; i < n; i++) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            result.enqueue(stack.pop());
        }

        while (!queue.isEmpty()) {
            result.enqueue(queue.dequeue());
        }

        return result;
    }
}
