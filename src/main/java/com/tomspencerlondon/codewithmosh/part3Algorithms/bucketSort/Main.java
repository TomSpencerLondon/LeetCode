package com.tomspencerlondon.codewithmosh.part3Algorithms.bucketSort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {6, 2, 5, 4, 3, 7};
        bucketSort(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void bucketSort(int[] array, int numberOfBuckets) {
        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int item : array) {
            buckets.get(item / numberOfBuckets).add(item);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (Integer integer : bucket) {
                array[index++] = integer;
            }
        }
    }
}
