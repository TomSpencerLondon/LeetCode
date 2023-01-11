package com.tomspencerlondon.arrays;

import java.util.Arrays;

public class Challenge4 {
    public static void main(String[] args) {
//        Challenge 4: Array of Products of All Elements Except Itself
//Given an array, return an array where each index stores the product of all numbers except the number on the index itself.

        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arrayOfProducts(arr)));
    }

    public static int[] arrayOfProducts(int[] arr) {
        int[] result = new int[arr.length];
        int left = 1;
        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left *= arr[i - 1];
            result[i] = left;
        }

        int right = 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            right *= arr[i + 1];
            result[i] *= right;
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
