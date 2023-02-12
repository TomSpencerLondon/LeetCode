package com.tomspencerlondon.codewithmosh.part3Algorithms.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {7, 3, 1, 5, 2};

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int boundary = partition(array, start, end);
        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[++boundary];
                array[boundary] = temp;
            }
        }

        return boundary;
    }
}
