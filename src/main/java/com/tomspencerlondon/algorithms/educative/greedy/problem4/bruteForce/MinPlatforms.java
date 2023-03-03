package com.tomspencerlondon.algorithms.educative.greedy.problem4.bruteForce;

public class MinPlatforms {
    public static void main(String[] args) {
        //Example 1
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        int answer  = findPlatform(arrival, departure);
        System.out.println("Minimum Number of Platforms Required for Plan1 = " + answer);


        System.out.println();

        // Example 2
        int arrival1[] = {200, 210, 300, 320, 350, 500};
        int departure1[] = {230, 240, 320, 430, 400, 520};
        int answer2 = findPlatform(arrival1, departure1);
        System.out.println("Minimum Number of Platforms Required for Plan2 = " + answer2);

    }

    private static int findPlatform(int[] arrival, int[] departure) {
        int numArrivals = arrival.length;
        int result = 0;
        int count = 0;

        for (int index = 0; index < numArrivals; index++) {
            count = 0;
            for (int i = 1; i < numArrivals; i++) {
                if (arrival[i] >= arrival[index] && arrival[i] <= departure[index]) {
                    count++;
                }
            }

            if (result < count) {
                result = count;
            }
        }

        return result;
    }
}
