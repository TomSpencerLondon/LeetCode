package com.tomspencerlondon.codewithmosh.part3Algorithms.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 9, 11, 18, 20, 21, 24, 30};

        System.out.println(binarySearchRec(array, 9));
    }

    private static int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    private static int binarySearchRec(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return binarySearchRec(array, target, left, middle - 1);
        }

        return binarySearchRec(array, target, middle + 1, right);
    }
}
