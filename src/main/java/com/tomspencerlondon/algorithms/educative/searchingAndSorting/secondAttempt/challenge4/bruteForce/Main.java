package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge4.bruteForce;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {100};
        int[] array2 = {1, 5, 8, 10, 20};

        System.out.println(getMedian(array1, array2));
    }

    public static double getMedian(int array1[], int array2[]) {
        int index = 0;
        int array1Index = 0;
        int array2Index = 0;
        int length = array1.length + array2.length;
        int[] tempArray = new int[length];

        while (array1Index < array1.length && array2Index < array2.length) {
            if (array1[array1Index] <= array2[array2Index]) {
                tempArray[index++] = array1[array1Index++];
            } else {
                tempArray[index++] = array2[array2Index++];
            }
        }

        while (array1Index < array1.length) {
            tempArray[index++] = array1[array1Index++];
        }

        while (array2Index < array2.length) {
            tempArray[index++] = array2[array2Index++];
        }

        int halfway = length / 2;
        if (length % 2 == 0) {
            return (double) (tempArray[halfway] + tempArray[halfway - 1]) / 2;
        } else {
            return (double) tempArray[halfway];
        }
    }
}
