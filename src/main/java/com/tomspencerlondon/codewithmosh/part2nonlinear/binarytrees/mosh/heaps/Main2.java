package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.heaps;

public class Main2 {

    public static void main(String[] args) {
        // insert: O(n)
        PriorityQueue queue = new PriorityQueue(10);

        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(5);

        System.out.println(queue);
    }
}
