package com.tomspencerlondon.algorithms.educative.sorting.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 2, 0, 1, 6, 3};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low;
        int j = low;

        while (i <= high) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }

            i++;
        }

        return j - 1;
    }
}
