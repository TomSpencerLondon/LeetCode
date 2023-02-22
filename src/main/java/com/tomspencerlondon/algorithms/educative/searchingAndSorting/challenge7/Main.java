package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge7;

public class Main {
    public static void main(String[] args) {
        int arr[] = {-5,-3,0,1,3,3,3,3,4,5};
        int key = 3;

        System.out.println(calcFreq(arr, key));
    }

    private static int calcFreq(int[] arr, int key) {
        int arrayLength = arr.length;

        int index = binarySearch(key, arr);

        if (index == -1) {
            return 0;
        }

        int count = 1;
        int start = index - 1;

        while (start >= 0 && arr[start] == key) {
            count++;
            start--;
        }

        int end = index + 1;
        while (end < arr.length && arr[end] == key) {
            count++;
            end++;
        }

        return count;
    }

    private static int binarySearch(int target, int[] arr) {
        if (arr.length <= 0) {
            return -1;
        }

        if (arr.length == 1) {
            if (arr[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
