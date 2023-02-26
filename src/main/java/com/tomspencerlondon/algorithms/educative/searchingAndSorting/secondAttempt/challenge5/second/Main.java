package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge5.second;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 1, 5, 4, 100, 100};

        mergeSort(arr);

        System.out.println(findDuplicates(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        int[] right = new int[arr.length - mid];

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int leftIndex = 0;
        int rightIndex  = 0;
        int index = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[index++] = left[leftIndex++];
            } else {
                arr[index++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            arr[index++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            arr[index++] = right[rightIndex++];
        }
    }


    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int prev = 0;
        int next = 1;

        while (next < arr.length) {
            if (arr[next] == arr[prev]) {
                while (next < arr.length && arr[next] == arr[prev]) {
                    next++;
                    prev++;
                }

                duplicates.add(arr[prev]);
            } else {
                next++;
                prev++;
            }
        }

        return duplicates;
    }

}
