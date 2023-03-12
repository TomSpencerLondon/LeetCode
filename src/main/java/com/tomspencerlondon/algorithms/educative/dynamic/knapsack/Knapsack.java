package com.tomspencerlondon.algorithms.educative.dynamic.knapsack;

public class Knapsack {
    public static void main(String[] args) {
        int[] profits = {60, 100, 120};
        int[] weights = {1, 2, 3};
        int capacity = 5;
        System.out.println(maxValue(profits, weights, weights.length, capacity));
    }

    private static int maxValue(int[] profits, int[] weights, int weightsLength, int capacity) {
        int[][] dp = new int[weightsLength + 1][capacity + 1];

        for (int currentWeight = 1; currentWeight <= weightsLength; currentWeight++) {
            for (int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++) {
                if (currentCapacity >= weights[currentWeight - 1]) {
                    dp[currentWeight][currentCapacity] = Math.max(profits[currentWeight - 1] + dp[currentWeight - 1][currentCapacity - weights[currentWeight - 1]], dp[currentWeight - 1][currentCapacity]);
                } else {
                    dp[currentWeight][currentCapacity] = dp[currentWeight - 1][currentCapacity];
                }
            }
        }

        return dp[weightsLength][capacity];
    }
}
