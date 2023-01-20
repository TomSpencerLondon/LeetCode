package com.tomspencerlondon.codewithmosh.queues.mosh;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        var front = queue.dequeue();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(front);

        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }
}
