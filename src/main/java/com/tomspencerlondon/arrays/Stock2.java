package com.tomspencerlondon.arrays;
// Leetcode 122 - variation
public class Stock2 {

// prices = [7, 1, 5, 3, 6, 4]
//  max Profit
//  buy stocks any number of times + sell stocks any number of times
//  Print days when bought and sold
//  Any number of transactions + next problem is minimum number of transactions
// e.g. buy at 1 + sell at 5, buy at 3 sell at 6
//  only buy second time after selling stock
//  profit = 7
// [7, 1, 0, 5, 3, 6, 4]
//  buy at 0 sell at 5, buy at 3 sell at 6
//  profit = 8
//  [3, 1, 4, 2, 6, 8, 12]
//  buy 1 sell 4 - profit 3
//  buy 2 sell 12 - profit 10
//  profit = 13
//  buy 3 sell (forget)
//  buy 1 sell 4 - profit 3
//  buy 2 sell 6 - profit 4
//  buy 6 sell 8 - profit 2
//  buy 8 sell 12 - profit 4
//  if stock price increases sell + buy
//  maxProfit =

//  [3, 1, 4, 2, 6, 8, 12]
//
  public static void main(String[] args) {
//    System.out.println(calculateProfit(new int[] {3, 1, 4, 2, 6, 8, 12}));
//    3 + 1 + 5 + 7 + 11 =
//    price = 3
//    currentMin = 3
//    profit = 3, 0
// buy date:
//    2, 4, 6
//    Sell date:
//    3, 5, 7
//    [3, 1, 4, 2, 6, 8, 12]
//    [1, 5, 4, 3, 2, 6, 10]
//    profit = 12
    System.out.println(calculateProfit(new int[] {1, 5, 4, 3, 2, 6, 10}));
//    4,
  }

  public static int calculateProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int buy = prices[0];
    int finalProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      int sell = prices[i];
      if (sell - buy > 0) {
        finalProfit += sell - buy;
        System.out.println("Buy: " + (i));
        System.out.println("Sell: " + (i + 1));
      }

      buy = prices[i];
    }

    return finalProfit;
  }
}
