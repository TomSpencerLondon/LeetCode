package com.tomspencerlondon.arrays;

public class Challenge11 {
//    Challenge 11: Find the Sum of Maximum Sum Subarray
//Given an array, find the sum of contiguous subarray with the largest sum.

    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, -2, -5, 10, -1};
        System.out.println(findMaxSum(arr));
    }

    private static int findMaxSum(int[] arr) {
        int maxSumSoFar = arr[0];
        int finalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxSumSoFar = Math.max(arr[i], maxSumSoFar + arr[i]);
            finalMax = Math.max(maxSumSoFar, finalMax);
        }

        return finalMax;
    }
}
