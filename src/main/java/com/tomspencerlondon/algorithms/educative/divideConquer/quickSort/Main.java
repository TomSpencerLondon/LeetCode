package com.tomspencerlondon.algorithms.educative.divideConquer.quickSort;

import java.util.Arrays;
import java.util.Random;

class Main {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1};

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = new Random().nextInt(end - start) + start;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, end);

        int leftPointer = partition(array, start, end, pivot);
        swap(array, leftPointer, end);

        quickSort(array, start, leftPointer - 1);
        quickSort(array, leftPointer + 1, end);
    }

    private static int partition(int[] array, int start, int end, int pivot) {
        int leftPointer = start;
        int rightPointer = end;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        return leftPointer;
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
