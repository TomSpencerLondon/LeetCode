package com.tomspencerlondon.codewithmosh.queues;

import com.tomspencerlondon.stacks.Queue;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new Queue<>(3);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        System.out.println(queue);

        ArrayQueue<Integer> queue = new ArrayQueue<>(3);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
