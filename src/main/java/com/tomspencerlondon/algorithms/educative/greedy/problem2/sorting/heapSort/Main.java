package com.tomspencerlondon.algorithms.educative.greedy.problem2.sorting.heapSort;

public class Main {
    public static void main(String[] args) {
        int pipes[] = { 4, 3, 2, 6 };
        int n = pipes.length;

        System.out.println("Total cost for connecting pipes is " + minCost(pipes, n));

        int[] pipes1 = {1, 1, 2, 6};
        n = pipes1.length;
        System.out.println("Total cost for connecting pipes1 is " + minCost(pipes1,n));
    }

    static int minCost(int[] pipes, int n) {
        int cost = 0;
        int minimum = 0;
        int secondMinimum = 0;

        MinHeap minHeap = new MinHeap(pipes, n);

        while (!minHeap.sizeIsOne()) {
            minimum = minHeap.extractMin();
            secondMinimum = minHeap.extractMin();

            cost += (minimum + secondMinimum);

            minHeap.insertKey(minimum + secondMinimum);
        }

        return cost;
    }
}
