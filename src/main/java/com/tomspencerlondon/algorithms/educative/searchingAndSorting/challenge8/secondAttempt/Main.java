package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge8.secondAttempt;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 8, 10, 15, 21, 25};
        int target = 24;
        System.out.println(insertPosition(array, target));
    }

    private static int insertPosition(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
