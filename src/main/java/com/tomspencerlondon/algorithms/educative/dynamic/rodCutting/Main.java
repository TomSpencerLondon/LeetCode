package com.tomspencerlondon.algorithms.educative.dynamic.rodCutting;

public class Main {

    public static void main(String[] args) {
        System.out.println(cutRod(new int[]{1, 5, 8, 9, 10, 17, 17, 20}, 8));
    }

    public static int cutRod(int price[], int n) {
        //code here
        int[][] dp = new int[price.length][price.length + 1];

        for (int i = 1; i <= price.length; i++) {
            dp[0][i] = price[0] * i;
        }

        for(int i = 1; i < price.length; i++) {
            for (int j = 1; j <= price.length; j++) {
                if (j > i) {
                    dp[i][j] = Math.max(dp[i - 1][j], price[i] + dp[i][j - i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[price.length - 1][price.length];
    }
}
