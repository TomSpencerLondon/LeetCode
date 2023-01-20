package com.tomspencerlondon.codewithmosh.queues;

import com.tomspencerlondon.stacks.Queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }
}
