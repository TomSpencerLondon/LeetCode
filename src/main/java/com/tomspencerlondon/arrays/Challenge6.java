package com.tomspencerlondon.arrays;

public class Challenge6 {
    // Challenge 6: First Non-Repeating Integer in an Array
    //Given an array, find the first integer, which is unique in the array.
    // Unique means the number does not repeat and appears only once in the whole array.

    public static void main(String[] args) {
        int[] arr = {9, 9, 2, 3, 2, 6, 6};

        System.out.println(findFirstNonRepeating(arr));
    }

    private static int findFirstNonRepeating(int[] arr) {
        int result = -1;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] store = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            store[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (store[arr[i]] == 1) {
                result = arr[i];
                break;
            }
        }

        return result;
    }
}
