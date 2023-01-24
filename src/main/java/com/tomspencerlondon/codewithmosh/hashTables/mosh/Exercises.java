package com.tomspencerlondon.codewithmosh.hashTables.mosh;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

    public static void main(String[] args) {

        // Most repeated element in array of integers
        int[] ints = {1, 2, 3, 3, 3, 4};

        System.out.println(mostRepeated(ints));
    }

    private static int mostRepeated(int[] ints) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : ints) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int maxFrequency = Integer.MIN_VALUE;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}
