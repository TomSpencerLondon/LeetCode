package com.tomspencerlondon.recursion.sumArray;

public class Main {

    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{1, 2,3 ,4, 5}, 5));
    }

    private static int arraySum(int[] array, int n) {
        return sumElements(array, 0, n);

    }

    private static int sumElements(int[] array, int start, int length) {
        if (start >= length) {
            return 0;
        }

        return array[start] + sumElements(array, start + 1, length);
    }
}
