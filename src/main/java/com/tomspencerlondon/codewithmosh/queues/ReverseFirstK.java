package com.tomspencerlondon.codewithmosh.queues;

import com.tomspencerlondon.stacks.Queue;

import java.util.Stack;

public class ReverseFirstK {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(6);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue);
        reverse(queue, 3);
        System.out.println(queue);
        System.out.println(queue.dequeue());
    }

    public static void reverse(Queue<Integer> queue, int n) {
        int currentSize = queue.getCurrentSize();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while (!queue.isEmpty() && count < n) {
            stack.push(queue.dequeue());
            count++;
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        int end = currentSize - count;

        while (end > 0) {
            queue.enqueue(queue.dequeue());
            end--;
        }
    }
}
