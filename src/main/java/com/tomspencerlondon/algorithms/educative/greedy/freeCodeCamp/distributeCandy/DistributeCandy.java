package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.distributeCandy;

import java.util.Arrays;

public class DistributeCandy {
    public static void main(String[] args) {
        int[] candies = {1, 3, 7, 1};
        // output = 7
        // explanation: {1, 2, 3, 1}
        // possible algorithm:
        // if val > prev
        // score += 1
        // score = 1
        int[] candies2 = {1, 7, 4, 3, 1};
        // 1, 2, 1, 1, 1 - not correct
        // not simply iterate left -> right
        // should be
        // 1, 4, 3, 2, 1
        // if kid > lKid: candy = l + 1
        // if kid > rKid: candy = r + 1
        int[] candies3 = {1, 2, 7, 4, 3, 3, 1};
        // left = 1
        // right = 1
        // 1, 2, 7, 4, 3, 3, 1
        // 1  2  3  2  1  2  1
        System.out.println(minimumCandies(candies3));
    }

    private static int minimumCandies(int[] input) {
        int numberOfKids = input.length;
        int[] data = Arrays.stream(input).sorted().toArray();

        int[] candies = new int[input.length];
        Arrays.fill(candies, 1);

        for (int i = 0; i < data.length; i++) {
            if (i > 0 && input[i] > input[i - 1]) {
                candies[i] = Math.max(candies[i], candies[i - 1] + 1);
            }

            if (i < numberOfKids - 1 && input[i] > input[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        return Arrays.stream(candies).sum();
    }
}
