package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge8;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 9;

        System.out.println(insertPosition(arr, target));
    }

    public static int insertPosition(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = Integer.MIN_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                result = mid;
                right = mid - 1;
            } else {
                result = mid + 1;
                left = mid + 1;
            }
        }

        return result;
    }
}
