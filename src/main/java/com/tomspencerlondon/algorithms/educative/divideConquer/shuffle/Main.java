package com.tomspencerlondon.algorithms.educative.divideConquer.shuffle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        shuffle(arr, 0, arr.length - 1);

        // expected:
        // [1, 5, 2, 6, 3, 7, 4, 8]
        System.out.println("Result = " + Arrays.toString(arr));
    }

    public static void shuffle(int arr[], int left, int right) {
        if (!powerOfTwoBitWise(arr.length)) {
            return;
        }

        if (right - left + 1 <= 2) {
            return;
        }

        int middle = (left + right) / 2;
        int leftMiddle = (middle + left) / 2;
        int rightStart = middle + 1;
        int leftStart = leftMiddle + 1;

        while (leftStart <= middle) {
            Helper.swap(arr, leftStart++, rightStart++);
        }
        System.out.println(Arrays.toString(arr));
        shuffle(arr, left, middle);
        shuffle(arr, middle + 1, right);
    }

    public static boolean powerOfTwo(int n) {
        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean powerOfTwoBitWise(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
