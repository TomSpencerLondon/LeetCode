package com.tomspencerlondon.codewithmosh.part3Algorithms.countingSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {3, 6, 4, 2, 5, 1};

        countingSort(numbers, 6);

        System.out.println(Arrays.toString(numbers));
    }

    private static void countingSort(int[] numbers, int max) {
        int[] counts = new int[max + 1];
        for (int number : numbers) {
            counts[number]++;
        }

        int k = 0;

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                numbers[k++] = i;
            }
        }
    }
}
