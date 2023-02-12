package com.tomspencerlondon.codewithmosh.part3Algorithms.linearSearch;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(linearSearch(array, 4));
    }

    public static int linearSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }
}
