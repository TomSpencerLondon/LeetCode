package com.tomspencerlondon.codewithmosh.queues;

import com.tomspencerlondon.stacks.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new Queue<>(3);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        System.out.println(queue);

//        ArrayQueue<Integer> queue = new ArrayQueue<>(3);
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue);

//        PriorityQueue2 queue = new PriorityQueue2(5);
//
//        queue.enqueue(5);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(1);
//        queue.enqueue(6);
//
//        System.out.println(queue);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.dequeue());
//        }

//        LinkedListQueue linkedListQueue = new LinkedListQueue();
//        linkedListQueue.enqueue(10);
//        linkedListQueue.enqueue(20);
//        linkedListQueue.enqueue(30);
//        System.out.println(linkedListQueue.peek());
//        System.out.println(linkedListQueue.getSize());

        StackWithTwoQueues stack = new StackWithTwoQueues(6);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Current size: " + stack.size());
    }
}
