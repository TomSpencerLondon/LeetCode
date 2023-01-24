package com.tomspencerlondon.codewithmosh.hashTables.mosh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercises {

    public static void main(String[] args) {

        // Most repeated element in array of integers
        int[] ints = {1, 2, 3, 3, 3, 4};
        System.out.println(mostRepeated(ints));

        // number of unique pairs of integers with difference k
        int[] numbers = {1, 7, 5, 9, 2, 12, 3};
        System.out.println(numberOfUniquePairs(numbers, 2));

        // return indices of 2 numbers that add to target
        int[] array = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    private static int[] twoSum(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int diff = k - number;
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(number, i);
        }

        return new int[]{-1, -1};
    }

    private static int numberOfUniquePairs(int[] numbers, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int count = 0;
        for (Integer number : map.keySet()) {
            if ((k == 0 && map.get(number) > 1)
                || (k > 0 && map.containsKey(number + k))) {
                count++;
            }
        }

        return count;
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
