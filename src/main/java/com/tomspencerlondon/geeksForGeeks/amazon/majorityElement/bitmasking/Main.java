package com.tomspencerlondon.geeksForGeeks.amazon.majorityElement.bitmasking;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        System.out.println(findMajority(arr, arr.length));
    }

    public static int findMajority(int[] array, int size) {

        int bits = 32;
        int number = 0;

        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 0; j < bits; j++) {
                if ((array[j] & (1 << i)) == 1) {
                    count++;
                }
            }

            if (count > (size / 2)) {
                number += (1 << i);
            }
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        if (count > (size / 2)) {
            return number;
        } else {
            return -1;
        }
    }
}
