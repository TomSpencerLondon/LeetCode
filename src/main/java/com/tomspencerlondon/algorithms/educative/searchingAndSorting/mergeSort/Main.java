package com.tomspencerlondon.algorithms.educative.searchingAndSorting.mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 3, 2, 8, 4, 7, 9, 10};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int left = 0;
        int right = 0;
        int index = 0;

        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left] <= rightArray[right]) {
                array[index++] = leftArray[left++];
            } else {
                array[index++] = rightArray[right++];
            }
        }

        while (left < leftArray.length) {
            array[index++] = leftArray[left++];
        }

        while (right < rightArray.length) {
            array[index++] = rightArray[right++];
        }
    }
}
