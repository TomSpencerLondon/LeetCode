package com.tomspencerlondon.algorithms.educative.searching.selectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 7, 6, 4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = temp;
        }
    }
}
