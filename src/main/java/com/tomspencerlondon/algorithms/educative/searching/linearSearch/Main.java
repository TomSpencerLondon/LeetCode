package com.tomspencerlondon.algorithms.educative.searching.linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 4, 1, 410, 5, 95, 4, -100, 20, 0};

        System.out.println(linearSearch(array, 1));
    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
