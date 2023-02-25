package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 50, 3, 4, 3, 5, 50, 2, 6, 4, 6, 1, 2};
        mergeSort(array);
        System.out.println(Arrays.toString(findDuplicates(array)));
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

    private static int[] findDuplicates(int[] array) {
        int index = 0;
        int prev = 0;
        int[] temp = new int[array.length];

        int next = 1;

        while (next < array.length) {
            if (array[next] == array[prev]) {
                while (next < array.length && array[next] == array[prev]) {
                    next++;
                    prev++;
                }

                temp[index++] = array[prev];
            } else {
                next++;
                prev++;
            }
        }

        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                break;
            }
            count++;
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
