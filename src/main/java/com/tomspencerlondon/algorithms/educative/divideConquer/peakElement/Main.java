package com.tomspencerlondon.algorithms.educative.divideConquer.peakElement;

public class Main {

    public static void main(String[] args) {
        int[] array = {6, 2, 3, 5, 1};
        System.out.println(peakElement(array));
    }

    private static int peakElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if ((middle == 0 && array[middle] >= array[middle + 1]) ||
                    (middle == array.length - 1 && array[middle] >= array[middle - 1])) {
                    return array[middle];
            } else if ((middle > 0 && middle < array.length - 1) &&
                    (array[middle] >= array[middle + 1] && array[middle] >= array[middle -1])) {
                return array[middle];
            } else if ((middle > 0) && array[middle - 1] >= array[middle]){
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }

        return -1;
    }
}
