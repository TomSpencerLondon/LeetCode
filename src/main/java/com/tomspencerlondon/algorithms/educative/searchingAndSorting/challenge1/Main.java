package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 81;

        System.out.println(Arrays.toString(twoSum(array, value)));


    }

    private static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[]{num, diff};
            }

            map.put(num, diff);
        }

        return new int[]{-1, -1};
    }
}
