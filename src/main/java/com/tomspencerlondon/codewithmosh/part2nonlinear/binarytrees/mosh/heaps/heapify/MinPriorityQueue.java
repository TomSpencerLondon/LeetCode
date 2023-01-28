package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.heaps.heapify;

public class MinPriorityQueue {

    private MinHeap heap = new MinHeap();

    public void add(String value, int priority) {
        heap.insert(priority, value);
    }

    public String remove() {
        return heap.remove();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
