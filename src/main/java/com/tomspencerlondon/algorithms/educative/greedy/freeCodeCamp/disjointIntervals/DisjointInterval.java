package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.disjointIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class DisjointInterval {

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {2, 10}, {4, 6}};
        int[][] input2 = {{1, 4}, {2, 3}, {4, 6}, {8, 9}};

        System.out.println(mostNonOverlapping(input2));
    }

    private static int mostNonOverlapping(int[][] input) {
        Arrays.sort(input, Comparator.comparingInt(array -> array[array.length - 1]));

        int count = 1;

        int r1 = input[0][1];

        for (int i = 1; i < input.length; i++) {
            int l1 = input[i][0];
            int r2 = input[i][1];

            if (l1 > r1) {
                count++;
                r1 = r2;
            }
        }

        return count;
    }
}
