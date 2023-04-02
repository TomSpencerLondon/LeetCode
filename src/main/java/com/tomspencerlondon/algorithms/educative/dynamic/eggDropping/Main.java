package com.tomspencerlondon.algorithms.educative.dynamic.eggDropping;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int eggs = 2;
        int floors = 6;
        // expected output 4
        int[][] dp = new int[eggs + 1][floors + 1];
        System.out.println(eggDrop(eggs, floors, dp));
    }

    private static int eggDrop(int eggs, int floors, int[][] dp) {
        if (eggs <= 0) {
            return 0;
        }

        if (floors == 1 || floors == 0) {
            return floors;
        }

        for (int i = 1; i <= floors; i++) {
            dp[1][i] = i;
        }

        for (int i = 1; i <= eggs; i++) {
            dp[i][1] = 1;
        }

        System.out.println();

        int result = 0;
        int min = Integer.MAX_VALUE;

        for (int egg = 2; egg <= eggs; egg++) {
            for (int floor = 2; floor <= floors; floor++) {
                min = Integer.MAX_VALUE;
                for (int prevFloor = 1; prevFloor < floor; prevFloor++) {
                    result = 1 + Math.max(
                            dp[egg - 1][prevFloor - 1],
                            dp[egg][floor - prevFloor]);
                    min = Math.min(result, min);
                }
                dp[egg][floor] = min;
                System.out.print(dp[egg][floor] + " | ");
            }
            System.out.println();
        }

        return dp[eggs][floors];
    }
}
