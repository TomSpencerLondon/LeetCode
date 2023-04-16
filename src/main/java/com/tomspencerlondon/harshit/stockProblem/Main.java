package com.tomspencerlondon.harshit.stockProblem;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateProfit(new int[]{3, 1, 4, 2, 6, 8, 12}));
    }

    private static int calculateProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int buy = prices[0];

        int finalProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int sell = prices[i];

            if (sell - buy > 0) {
                finalProfit += sell - buy;
            }

            buy = prices[i];
        }

        return finalProfit;
    }


}
