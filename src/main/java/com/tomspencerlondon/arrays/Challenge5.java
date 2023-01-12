package com.tomspencerlondon.arrays;

public class Challenge5 {
//    Challenge 5: Find Minimum Value in Array
//Given an array of size "n", can you find the minimum value in the array?

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
