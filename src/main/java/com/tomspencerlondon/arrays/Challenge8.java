package com.tomspencerlondon.arrays;

import java.util.Arrays;

public class Challenge8 {
    // Challenge 8: Right Rotate the Array by One Index
    //Given an array, can you rotate its elements once from right to left?

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(rotateArray(arr)));
    }

    private static int[] rotateArray(int[] arr) {
        int last = arr[arr.length - 1];


        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
        return arr;
    }
}
