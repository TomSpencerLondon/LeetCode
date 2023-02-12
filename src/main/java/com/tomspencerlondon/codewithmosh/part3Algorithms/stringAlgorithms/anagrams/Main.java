package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.anagrams;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(areAnagrams("AbCD", "DBCA"));
    }

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null || first.length() != second.length()) {
            return false;
        }

        char[] firstArray = first.toLowerCase().toCharArray();
        Arrays.sort(firstArray);
        char[] secondArray = second.toLowerCase().toCharArray();
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}
