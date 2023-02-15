package com.tomspencerlondon.algorithms.educative.sorting.bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 6, 7, 5};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
