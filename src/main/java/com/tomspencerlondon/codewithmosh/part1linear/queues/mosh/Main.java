package com.tomspencerlondon.codewithmosh.part1linear.queues.mosh;

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


//        QueueWithStack queue = new QueueWithStack(4);
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue);

        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        var first = queue.dequeue();
        System.out.println(first);

        var second = queue.dequeue();
        System.out.println(second);

        var third = queue.dequeue();
        System.out.println(third);

        queue.dequeue();

    }
}
