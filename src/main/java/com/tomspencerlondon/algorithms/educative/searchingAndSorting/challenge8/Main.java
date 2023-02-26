package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge8;

public class Main {

    public static void main(String[] args) {
//        Search Insert Position

//        Given a sorted array and a target value, return the
//        index where the target value would be if it were inserted
//        in order. If the target index is already present in the array,
//        return the index of where it is found. You may assume that no
//        duplicates are in the array.

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
