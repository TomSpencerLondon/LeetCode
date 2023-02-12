package com.tomspencerlondon.codewithmosh.part3Algorithms.insertion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5};

        insertionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int j = i;
            while (j >= 0) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }

                j--;
            }
        }
    }
}
