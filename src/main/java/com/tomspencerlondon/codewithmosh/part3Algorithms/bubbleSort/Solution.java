package com.tomspencerlondon.codewithmosh.part3Algorithms.bubbleSort;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 6, 4, 5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
