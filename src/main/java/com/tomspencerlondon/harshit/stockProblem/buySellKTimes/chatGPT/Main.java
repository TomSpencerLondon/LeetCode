package com.tomspencerlondon.harshit.stockProblem.buySellKTimes.chatGPT;

public class Main {

    public static int maxProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0) {
            return 0;
        }
        if (k >= n / 2) {
            // if k is large enough, we can do as many transactions as we want
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i-1]) {
                    maxProfit += prices[i] - prices[i-1];
                }
            }
            return maxProfit;
        }
        int[][] dp = new int[k+1][n];
        for (int i = 1; i <= k; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i-1][j] - prices[j]);
            }
        }
        return dp[k][n-1];
    }

}

// Let me explain how it works. First, we handle the edge cases where either the prices array is empty or we are not allowed to do any transactions. In both cases, the maximum profit is zero.
//
//Next, we check if we can do as many transactions as we want. If k is greater than or equal to n/2, we can do a transaction whenever there is a price increase. We iterate through the prices array and add up all the positive price differences to get the maximum profit.
//
//Otherwise, we use dynamic programming to solve the problem. We create a 2D array dp where dp[i][j] represents the maximum profit that can be made by doing i transactions up to the jth day (inclusive). We initialize dp[0][j] to 0 for all j, since we can't make any profit without doing any transactions.
//
//For the remaining cells in dp, we use a nested loop to iterate through all possible transactions and days. At each day j, we either don't do any transactions and keep the maximum profit from the previous day (dp[i][j-1]), or we do a transaction on day j and add the maximum profit we can make up to day j-1 (prices[j] + maxDiff), where maxDiff is the maximum difference we can have up to day j-1 with i-1 transactions. We update maxDiff at each day j by taking the maximum of the previous maxDiff and the difference between dp[i-1][j] and prices[j].
//
//Finally, the answer is stored in dp[k][n-1], which represents the maximum profit that can be made with k transactions up to the last day.
//
//I hope this helps!