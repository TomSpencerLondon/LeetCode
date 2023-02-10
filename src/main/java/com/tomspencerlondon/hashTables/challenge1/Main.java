package com.tomspencerlondon.hashTables.challenge1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {9, 4, 7, 1, -2, 6, 5};
        int[] arr2 = {7, 1, -2};
        int[] arr3 = {10, 12};

        System.out.println(isSubset(arr1, arr2));
        System.out.println(isSubset(arr1, arr3));
    }

    private static boolean isSubset(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!set.contains(arr1[i])) {
                set.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!set.contains(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}
