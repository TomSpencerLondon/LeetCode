package com.tomspencerlondon.algorithms.educative.dynamic.coinChange.performant;

public class CoinChange {
    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        int amount = 10;

        System.out.println(countChange(denoms, amount));
    }

    private static int countChange(int[] denoms, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < denoms.length; i++) {
            for (int j = denoms[i]; j <= amount; j++) {
                dp[j] += dp[j - denoms[i]];
            }
        }

        return dp[amount];
    }
}
