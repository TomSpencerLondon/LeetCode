package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 21, 3, 14, 5, 60, 7, 6};
        int target = 81;

        System.out.println(Arrays.toString(findSum(array, target)));
    }

    private static int[] findSum(int[] array, int target) {
        mergeSort(array);

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int addition = array[left] + array[right];
            if (addition == target) {
                return new int[]{array[left], array[right]};
            } else if (addition < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
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
