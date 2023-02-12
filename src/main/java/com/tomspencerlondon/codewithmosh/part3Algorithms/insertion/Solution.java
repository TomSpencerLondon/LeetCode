package com.tomspencerlondon.codewithmosh.part3Algorithms.insertion;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {3, 6, 2, 1, 5, 4};
        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }
}
