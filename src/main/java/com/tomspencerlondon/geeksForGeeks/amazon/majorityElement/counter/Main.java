package com.tomspencerlondon.geeksForGeeks.amazon.majorityElement.counter;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, 3, 3, 2};

        System.out.println(majorityElement(array, array.length));
    }

    private static int majorityElement(int[] array, int length) {
        int majority = array[0];
        int count = 1;

        for (int i = 0; i < length; i++) {
            if (array[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = array[i];
                    count = 1;
                }
            }
        }

        return majority;
    }
}
