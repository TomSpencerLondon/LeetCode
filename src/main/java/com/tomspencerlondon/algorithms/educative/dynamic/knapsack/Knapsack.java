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

        for (int i = 1; i <= weightsLength; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j >= weights[i - 1]) {
                    dp[i][j] = Math.max(
                            dp[i - 1][j],
                            profits[i - 1] +
                            dp[i - 1][j - weights[i - 1]]
                            );
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[weightsLength][capacity];
    }
}
