package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge2;

public class Main {
    public static void main(String[] args) {
        // Search in a rotated array


        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        System.out.println(rotatedArraySearch(array, target));
    }

    private static int rotatedArraySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (target < array[mid]) {
                if (target >= array[left] && target <= array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= array[right] && target >= array[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
