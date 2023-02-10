package com.tomspencerlondon.algorithms.educative.greedy.problem1.solution;

import java.util.ArrayList;
import java.util.List;

public class ChangeMachine {
    public static int[] coins = {25, 10, 5, 1};
    public static void main(String[] args) {
        int amount = 1;
        System.out.println(amount + " --> " + getMinCoins(amount));

        amount = 17;
        System.out.println(amount + " --> " + getMinCoins(amount));

        amount = 33;
        System.out.println(amount + " --> " + getMinCoins(amount));

        amount = 99;
        System.out.println(amount + " --> " + getMinCoins(amount));
    }

    private static List<Integer> getMinCoins(int amount) {
        List<Integer> change = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                change.add(coins[i]);
            }
        }

        return change;
    }


}
