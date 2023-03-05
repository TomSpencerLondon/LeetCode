package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.highestProduct;

import java.util.Arrays;

public class HighestProduct {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {0, -1, 10, 7, 5};
        int[] array3 = {-5, -2, -1, 0, 0, 1, 1, 5};

        System.out.println(highestProduct(array1));
        System.out.println(highestProduct(array2));
        System.out.println(highestProduct(array3));
    }

    private static int highestProduct(int[] input) {
        Arrays.sort(input);

        int high3 = input[input.length - 1] * input[input.length - 2] * input[input.length - 3];
        int low2High1 = input[0] * input[1] * input[input.length - 1];

        return Math.max(high3, low2High1);
    }
}
