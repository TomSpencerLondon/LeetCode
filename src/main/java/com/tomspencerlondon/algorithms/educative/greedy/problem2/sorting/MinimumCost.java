package com.tomspencerlondon.algorithms.educative.greedy.problem2.sorting;

import java.util.Arrays;

public class MinimumCost {
    public static void main(String[] args) {
        int[] pipes = {4, 3, 2, 6 };
        System.out.println("Total cost for connecting pipes is " + minCost(pipes));
        int[] pipes1 = {1, 1, 2, 6};
        System.out.println("Total cost for connecting pipes1 is " + minCost(pipes1));
    }

    private static int minCost(int[] pipes) {
        int cost = 0;
        int numberOfPipes = pipes.length - 1;

        Arrays.sort(pipes);
        for (int i = 0; i < numberOfPipes; i++) {
            int prevCost = cost;
            cost = (pipes[i] + pipes[i + 1]);
            pipes[i + 1] = cost;
            cost = cost + prevCost;
        }

        return cost;
    }
}