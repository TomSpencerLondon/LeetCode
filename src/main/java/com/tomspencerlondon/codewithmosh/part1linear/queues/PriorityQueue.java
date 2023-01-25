package com.tomspencerlondon.codewithmosh.part1linear.queues;

public class PriorityQueue {

    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>();

        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
