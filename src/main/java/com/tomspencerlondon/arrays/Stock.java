package com.tomspencerlondon.arrays;

// Leetcode 121
public class Stock {
  // create an array
  public static void main(String[] args) {
//prices = [7, 1, 5, 3, 6, 4]
//
//                         ^                buy
//    sell - buy
//    4 - 7 = -3
//
//    currentMin = Integer.MAX_VALUE
//    profit = Integer.MIN_VALUE;
//

//    price = prices[i]
//    price = 6
//    currentMin = 1
//    profit = 5
//
//    currentProfit = price - currentMin
//    currentMin = Math.min(currentMin, currentBuy)
//    profit = Math.max(profit, currentProfit)
//
//    maximum profit
//    what day stock price min - stock max
//
//    1st day buy stock
//    sell on any other day
//    buy date, sell date + maximum profit

//    Feedback:
//    Able to understand the problem
//    Improve - every time provide solution - think whether alternative could be better
//    When thinking outloud - whatever saying could be improved
//    Vague description for problems - explaining could be improved
//    variable naming is very good - thought about the value names
//    Quite sure on dry run with - pointers - quite good - making clear in your mind and interviewer
//    What you are thinking - pointer line - arrow key -> pointer at line etc.
//    Whenever solve problems - trees + linked list - easy to forget pointer, try to maintain pointer in trees and linkedlist
//    Require improvement: speed of coding
//    Take a lot of time - 1 problem takes quite long time - more practice to speed up
//    solve a couple of problems on own - do whole coding - with timer 30 mins / 45 mins
//    easy should be 30, medium 45, hard 60 - 90 mins
//    communication was crisp
//    dry run was pretty good - missed corner cases - cases where code will fail
//    empty array, min array, large array, small array
//    Think every scenario before submitting the code
//    When solve problem - before ask time complexity and space complexity -
//    ask if looking for something better?
//


    int[] stocks = {7, 1, 5, 3, 6, 4};
//                                 ^
//    [7, 6, 5, 4, 3, 2, 1]
//    price = 4
//    currentMin = 1
//    profit = 5

//  prices = [7, 1, 5, 3, 6, 4]
//                  ^              buyDayNumber
//                        ^     sellDayNumber
//    buyDayNumber = 2
//    sellDayNumber = 5
    int[] stock3 = {-8, -9, -7, 1, 2, 3};
//
    int[] stock2 = {7, 6, 5, 4, 3, 2, 1};
//    buyDay = 7
//    sellDay = 7
    System.out.println(calculateProfit(stock2));
  }

  public static int calculateProfit(int[] prices) {
    int buyDayNumber = 0;
    int sellDayNumber = 0;
    if (prices.length == 0) {
      return 0;
    }

    int currentMin = Integer.MAX_VALUE;
    int profit = Integer.MIN_VALUE;
    for (int i = 0; i < prices.length; i++) {
      int price = prices[i];
      if (price <= currentMin) {
        buyDayNumber = i + 1;
      }
      currentMin = Math.min(currentMin, price);
      if (price - currentMin >= profit) {
        sellDayNumber = i + 1;
      }
      profit = Math.max(profit, price - currentMin);
    }

    System.out.println("Bought on day: " + buyDayNumber);
    System.out.println("Sold on day: " + sellDayNumber);
    return profit;
  }
}
