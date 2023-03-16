package com.tomspencerlondon.algorithms.educative.dynamic.coinChange;

public class CoinChange {

    // You are given coins of different denominations and total amount
    // Use fewest number of coins to create the required change
    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        int amount = 10;

        System.out.println(countChange(denoms, amount));
    }

    public static int countChange(int denoms[], int amount)
    {
        int[][] dp = new int[denoms.length + 1][amount + 1];

        for (int i = 0; i <= denoms.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= denoms.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (denoms[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - denoms[i - 1]];
                }
            }
        }

        return dp[denoms.length][amount];
    }
}
