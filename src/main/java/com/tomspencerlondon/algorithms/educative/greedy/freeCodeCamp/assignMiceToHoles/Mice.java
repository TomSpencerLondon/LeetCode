package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.assignMiceToHoles;

import java.util.Arrays;

public class Mice {
    public static void main(String[] args) {
        int[] mice = {3, 2, -4};
        int[] holes = {0, -2, 4};

        System.out.println(minimumTime(mice, holes));
    }

    private static int minimumTime(int[] mice, int[] holes) {
        Arrays.sort(mice);
        Arrays.sort(holes);

        int result = 0;

        for (int i = 0; i < mice.length; i++) {
            result = Math.max(result, Math.abs(mice[i] - holes[i]));
        }

        return result;
    }
}
