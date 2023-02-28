package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge10.attempt2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 2, 1};
        dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
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

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
