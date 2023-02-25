package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge2;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 2, 3};
        int target = 5;
        System.out.println(searchInRotatedArray(array, target));
    }

    private static int searchInRotatedArray(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                if (array[mid] <= target && target <= array[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (array[left] <= target && target <= array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}
