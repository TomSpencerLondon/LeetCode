package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.anagrams;

import java.util.Arrays;

public class Main {

    public static final int ENGLISH_ALPHABET = 26;

    public static void main(String[] args) {
        System.out.println(areAnagrams("AbCD", "DBCA"));
    }

    public static boolean areAnagrams2(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        for (int i = 0; i < first.length(); i++) {
            frequencies[first.charAt(i) - 'a']++;
        }

        second = second.toLowerCase();
        for (int i = 0; i < second.length(); i++) {
            int index = second.charAt(i) - 'a';
            if (frequencies[index] == 0) {
                return false;
            }
            frequencies[index]--;
        }


        return true;
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
