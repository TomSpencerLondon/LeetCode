package com.tomspencerlondon.algorithms.educative.divideConquer.mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 1, 3, 2, 7, 5, 9};

        mergeSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        int midIndex = numbers.length / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[numbers.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }

        for (int i = midIndex; i < numbers.length; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }


        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int numbersIndex = 0;
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftHalf[leftIndex] <= rightHalf[rightIndex]) {
                numbers[numbersIndex] = leftHalf[leftIndex++];
            } else {
                numbers[numbersIndex] = rightHalf[rightIndex++];
            }

            numbersIndex++;
        }

        while (leftIndex < leftSize) {
            numbers[numbersIndex++] = leftHalf[leftIndex++];
        }

        while (rightIndex < rightSize) {
            numbers[numbersIndex++] = rightHalf[rightIndex++];
        }
    }
}
