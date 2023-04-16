package com.tomspencerlondon.algorithms.educative.divideConquer.shuffle;

class Helper {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}