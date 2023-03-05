package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.bulbs;

public class Bulbs {

    public static void main(String[] args) {
//        System.out.println(bulbs(new int[]{1, 0, 1}));
        System.out.println(bulbs(new int[]{0, 1, 0, 1, 1, 0, 1, 1}));
    }

    private static int bulbs(int[] bulbs) {
        int cost = 0;

        for (int i = 0; i < bulbs.length; i++) {
            if (cost % 2 != 0){
                bulbs[i] = bulbs[i] == 0 ? 1 : 0;
            }

            if (bulbs[i] == 1) {
                continue;
            } else {
                cost++;
            }
        }

        return cost;
    }


}
