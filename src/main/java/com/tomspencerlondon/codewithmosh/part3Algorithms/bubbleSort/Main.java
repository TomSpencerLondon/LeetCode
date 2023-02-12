package com.tomspencerlondon.codewithmosh.part3Algorithms.bubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 1, 6, 4, 3};

        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] bubbleSort(int[] array) {
        int[] result = array;
        int end = array.length;

        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }
}
