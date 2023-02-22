package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge5;

import com.tomspencerlondon.sedgewick.In;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 3, 5, 4, 100, 100};

        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates.isEmpty() ? List.of(Integer.MIN_VALUE) :
                duplicates;
    }
}