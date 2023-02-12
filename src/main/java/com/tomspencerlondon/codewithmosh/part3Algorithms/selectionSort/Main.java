package com.tomspencerlondon.codewithmosh.part3Algorithms.selectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 2, 6, 1, 5, 4};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }


}
