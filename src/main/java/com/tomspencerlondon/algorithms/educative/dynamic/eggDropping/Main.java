package com.tomspencerlondon.algorithms.educative.dynamic.eggDropping;

public class Main {
    public static void main(String[] args) {
        int eggs = 6;
        int floors = 15;
        // expected output 4
        System.out.println(eggDrop(eggs, floors));
    }

    private static int eggDrop(int eggs, int floors) {
        if (floors == 1 || floors == 0) {
            return floors;
        }

        if (eggs == 1) {
            return floors;
        }

        int result = 0;
        int min = Integer.MAX_VALUE;

        for (int floor = 1; floor <= floors; floor++) {
            result = Math.max(eggDrop(eggs - 1, floor - 1), eggDrop(eggs, floors - floor));

            min = Math.min(result, min);
        }

        return min + 1;
    }
}
