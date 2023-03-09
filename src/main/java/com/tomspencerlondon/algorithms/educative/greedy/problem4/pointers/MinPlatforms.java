package com.tomspencerlondon.algorithms.educative.greedy.problem4.pointers;

import java.util.Arrays;

public enum MinPlatforms {
    ;

    public static void main(String[] args) {
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
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformsNeeded = 1;
        int result = 1;

        int arrivalIndex = 1;
        int departureIndex = 0;
        while (arrivalIndex < arrival.length && departureIndex < departure.length) {
            if (arrival[arrivalIndex] <= departure[departureIndex]) {
                platformsNeeded++;
                arrivalIndex++;

                if (platformsNeeded > result) {
                    result = platformsNeeded;
                }
            } else {
                platformsNeeded--;
                departureIndex++;
            }
        }

        return result;
    }
}
