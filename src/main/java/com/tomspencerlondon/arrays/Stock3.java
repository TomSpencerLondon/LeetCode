package com.tomspencerlondon.arrays;

public class Stock3 {
//  Make problem harder - Add minimum transaction
//  give all days bought and sold stock
//  Minimum number of transactions
//  [3, 1, 4, 2, 6, 8, 12]
//  buy 1 sell 4 - profit 3
//  buy 2 sell 12 - profit 10
//  profit = 13

  public static void main(String[] args) {
//  Minimum number of transactions
//  [3, 1, 4, 2, 6, 8, 12]
//  buy 1 sell 4 - profit 3
//  buy 2 sell 12 - profit 10
//  profit = 13
    System.out.println(calculateProfit(new int[]{3, 1, 4, 2, 6, 8, 12}));
  }

  public static int calculateProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int buy = prices[0];
    int finalProfit = 0;
    int lastBuyIndex = 0;
    for (int i = 1; i < prices.length - 1; i++) {
      int sell = prices[i];
      if (sell - buy > 0 && sell > prices[i + 1]) {
        finalProfit += sell - buy;
        System.out.println("Buy: " + (i));
        System.out.println("Sell: " + (i + 1));
        lastBuyIndex = i + 2;
      }

      buy = prices[i];
    }

    int lastSellIndex = prices.length - 1;
    int sell = prices[lastSellIndex];

    if (sell - buy > 0) {
      finalProfit += sell - prices[lastBuyIndex - 1];
      System.out.println("Buy: " + lastBuyIndex);
      System.out.println("Sell: " + (lastSellIndex + 1));
    }

    return finalProfit;
  }
}
