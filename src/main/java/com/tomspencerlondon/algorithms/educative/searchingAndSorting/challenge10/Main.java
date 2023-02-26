package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 2, 1};
        dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr)); // import java.util.Arrays; for this functionality

    }

    private static void dutchNationalFlag(int[] array) {
        int left = 0;
        int mid = 0;
        int right = array.length - 1;

        while (mid <= right) {
            if (array[mid] == 0) {
                mySwap(array, left++, mid++);
            } else if (array[mid] == 2) {
                mySwap(array, mid, right--);
            } else {
                mid++;
            }
        }
    }

    private static void mySwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
