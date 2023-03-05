package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.largestPermutation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestPermutation {

    public static void main(String[] args) {
        int[] input = {1, 3, 2};
        int[] input2 = {1, 3, 4, 2, 6, 5, 8, 7};
        System.out.println(Arrays.toString(largestPermutation(input2, 6)));
    }

    private static int[] largestPermutation(int[] input, int k) {
        int i = 0;
        int max = Arrays.stream(input).max().orElse(Integer.MIN_VALUE);
        Map<Integer, Integer> keys = new HashMap<>();

        for (int j = 0; j < input.length; j++) {
            keys.put(input[j], j);
        }

        while (k > 0 && i < input.length) {
            int j = keys.get(max);
            if (i != j) {
                k--;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;

                keys.put(input[i], i);
                keys.put(input[j], j);
            }

            i++;
            max--;
        }

        return input;
    }
}
