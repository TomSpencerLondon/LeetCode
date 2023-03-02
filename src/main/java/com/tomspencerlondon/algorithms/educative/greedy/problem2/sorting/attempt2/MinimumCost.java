package com.tomspencerlondon.algorithms.educative.greedy.problem2.sorting.attempt2;

import java.util.Arrays;

public class MinimumCost {
    public static void main(String[] args) {
        int[] pipes = {4, 3, 2, 6 };
        System.out.println("Total cost for connecting pipes is " + minCost(pipes));
        int[] pipes1 = {1, 1, 2, 6};
        System.out.println("Total cost for connecting pipes1 is " + minCost(pipes1));
    }

    private static int minCost(int[] pipes) {
        Arrays.sort(pipes);

        int prevSum = pipes[0] + pipes[1];
        int cost = 0;
        for (int i = 2; i < pipes.length; i++) {
            cost += prevSum;
            prevSum += pipes[i];
        }

        cost += prevSum;

        return cost;
    }


}