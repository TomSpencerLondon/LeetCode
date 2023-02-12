package com.tomspencerlondon.codewithmosh.part3Algorithms.mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 6, 4, 5};

        mergeSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        int middle = numbers.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = numbers[i];
        }

        int[] right = new int[numbers.length - middle];
        for (int i = middle; i < numbers.length; i++) {
            right[i - middle] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, numbers);
    }


    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}
