package com.tomspencerlondon.algorithms.educative.searching.binarySearch;

public class Main {

    public static void main(String[] args) {
        int[] array = {-100, 0, 0, 1, 4, 4, 5, 5, 95, 200};

        System.out.println(binarySearch(array, 95));
    }

    private static int binarySearch(int[] array, int target) {
        if (array.length <= 0) {
            return -1;
        }

        if (array.length == 1) {
            if (array[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
