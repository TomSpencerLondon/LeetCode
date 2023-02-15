package com.tomspencerlondon.algorithms.educative.sorting.insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 6, 7, 5};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }
}
