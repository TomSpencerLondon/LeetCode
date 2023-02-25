package com.tomspencerlondon.geeksForGeeks.amazon.missingElement;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 8, 3, 4, 9, 10, 5};

        System.out.println(missingNumber(array, array.length));
    }

    private static int missingNumber(int[] array, int length) {
        int total = array.length + 1;

        int sumOfNumbersInArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfNumbersInArray += array[i];
        }

        int allNumbersAdded = (total * (total + 1)) / 2;
        return allNumbersAdded - sumOfNumbersInArray;
    }
}
