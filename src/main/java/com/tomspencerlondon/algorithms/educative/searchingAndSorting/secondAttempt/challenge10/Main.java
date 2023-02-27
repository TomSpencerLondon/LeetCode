package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 2, 1};
        dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr)); // import java.util.Arrays; for this functionality

    }

    private static void dutchNationalFlag(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr, left++, mid++);
            } else if (arr[mid] == 2) {
                swap(arr, mid, right--);
            } else if (arr[mid] == 1) {
                mid++;
            }
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
