package com.tomspencerlondon.codewithmosh.part3Algorithms.exponentialSearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};

        System.out.println(search(numbers, 7));
    }

    public static int search(int[] array, int target) {
        int bound = 1;

        while (bound < array.length &&
                array[bound] < target) {
            bound *= 2;
        }

        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return binarySearch(array, target, left, right);
    }


    public static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

}
