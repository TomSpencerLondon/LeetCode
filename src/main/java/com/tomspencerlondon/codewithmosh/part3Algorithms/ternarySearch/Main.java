package com.tomspencerlondon.codewithmosh.part3Algorithms.ternarySearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 9};

        System.out.println(ternarySearch(array, 6));
    }

    public static int ternarySearch(int[] array, int target) {
        return ternarySearch(array, target, 0, array.length);
    }

    public static int ternarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target) {
            return mid1;
        }

        if (array[mid2] == target) {
            return mid2;
        }

        if (target < array[mid1]) {
            return ternarySearch(array, target, left, mid1 - 1);
        }

        if (target > array[mid2]) {
            return ternarySearch(array, target, mid2 + 1, right);
        }

        return ternarySearch(array, target, mid1 + 1, mid2 - 1);
    }
}
