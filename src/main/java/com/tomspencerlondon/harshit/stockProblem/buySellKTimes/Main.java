package com.tomspencerlondon.harshit.stockProblem.buySellKTimes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxProfit(3, new int[]{3, 5, 1, 4, 2, 6, 8, 12}));
    }

    public static int maxProfit(int k, int[] prices) {
        int length = prices.length;

        if (length <= 1 || k <= 0) {
            return 0;
        }

        int profit;

        if (k >= length / 2) {
            profit = IntStream.range(0, length - 1)
                    .filter(i -> prices[i] < prices[i + 1])
                    .map(i -> prices[i + 1] - prices[i])
                    .sum();

            return profit;
        }

        int[] buy = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        int[] sell = new int[k];

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < k; j++) {
                buy[j] = Math.max(
                        buy[j],
                        j == 0 ? 0 - prices[i] :
                                sell[j - 1] - prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
        }

        return sell[k - 1];
    }
}
