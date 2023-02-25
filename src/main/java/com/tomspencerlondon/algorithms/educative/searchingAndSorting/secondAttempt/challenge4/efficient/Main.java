package com.tomspencerlondon.algorithms.educative.searchingAndSorting.secondAttempt.challenge4.efficient;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {100};
        int[] array2 = {1, 5, 8, 10, 20};

        System.out.println(getMedian(array1, array2));
    }

    private static double getMedian(int[] array1, int[] array2) {
        int array1Index = 0;
        int array2Index = 0;
        double median = 0;
        double prevMedian = 0;
        int length = array1.length + array2.length;
        int halfLength = (length / 2);
        int current = 0;

        while (array1Index < array1.length
                && array2Index < array2.length
                && current < halfLength
        ) {
            if (array1[array1Index] <= array2[array2Index]) {
                prevMedian = median;
                median = array1[array1Index++];
                current++;
            } else {
                prevMedian = median;
                median = array2[array2Index++];
                current++;
            }
        }

        while (array1Index < array1.length && current < halfLength) {
            prevMedian = median;
            median = array1[array1Index++];
            current++;
        }

        while (array2Index < array2.length && current < halfLength) {
            prevMedian = median;
            median = array2[array2Index++];
            current++;
        }

        if (length % 2 == 0) {
            return (double) prevMedian + median / 2;
        } else {
            return (double) median;
        }

    }


}
