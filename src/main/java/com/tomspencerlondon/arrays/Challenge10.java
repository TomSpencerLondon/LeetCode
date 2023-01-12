package com.tomspencerlondon.arrays;

import java.util.Arrays;

public class Challenge10 {
//    Challenge 10: Rearrange Sorted Array in Max/Min Form
//Given an array, can you re-arrange the elements such that
// the first position will have the largest number,
// the second will have the smallest,
// the third will have the second-largest, and so on.

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(rearrangeMaxMin(arr)));
    }

    private static int[] rearrangeMaxMin(int[] arr) {
        int maxElement = Arrays.stream(arr).max().getAsInt() + 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= maxElement;
        }

        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int index = 0;

        while (minIndex <= maxIndex) {
            if (index % 2 == 0) {
                arr[index++] += arr[maxIndex--] / maxElement;
            } else {
                arr[index++] += arr[minIndex++] / maxElement;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] %= maxElement;
        }

        return arr;
    }
}
