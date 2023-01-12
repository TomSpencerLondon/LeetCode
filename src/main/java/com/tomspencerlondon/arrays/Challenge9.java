package com.tomspencerlondon.arrays;

import java.util.Arrays;

public class Challenge9 {
//  Challenge 9: Re-arrange Positive & Negative Values
//Given an array, can you re-arrange its elements in such a way
// that the negative elements appear at one side and positive
// elements appear at the other?

    public static void main(String[] args) {
        int[] arr = new int[]{10, -1, 20, 4, 5, -9, -6};

//        Expected
//        [-1, -9, -6, 10, 20, 4, 5]

        System.out.println(Arrays.toString(rearrange(arr)));
    }

    private static int[] rearrange(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] < 0) {
                low++;
            } else if (arr[high] > 0) {
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        return arr;
    }
}
