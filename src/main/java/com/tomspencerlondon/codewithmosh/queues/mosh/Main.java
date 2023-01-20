package com.tomspencerlondon.codewithmosh.queues.mosh;

import com.tomspencerlondon.codewithmosh.queues.QueueWithStack;

public class Main {

    public static void main(String[] args) {
//        ArrayQueue queue = new ArrayQueue(5);
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        var front = queue.dequeue();
//
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        System.out.println(front);
//
//        System.out.println(queue);
//        queue.dequeue();
//        System.out.println(queue);


        QueueWithStack queue = new QueueWithStack(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());

        System.out.println(queue);
    }
}
