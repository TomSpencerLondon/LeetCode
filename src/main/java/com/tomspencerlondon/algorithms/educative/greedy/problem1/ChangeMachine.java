package com.tomspencerlondon.algorithms.educative.greedy.problem1;

import java.util.ArrayList;
import java.util.List;

public class ChangeMachine {

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

    public static int [] coins = {25, 10, 5, 1};

    public static List<Integer> getMinCoins(int amount) {
        List<Integer> change = new ArrayList<>();

        for (Integer coin : coins) {
            int coinCount = amount / coin;
            amount %= coin;
            for (int i = 0; i < coinCount; i++) {
                change.add(coin);
            }
        }

        return change;
    }
}
