package com.tomspencerlondon.codewithmosh.part3Algorithms.selectionSort;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 5, 2};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
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
