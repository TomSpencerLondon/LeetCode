package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.countVowels;

public class Main {
    public static void main(String[] args) {
        String input = "hello world";

        System.out.println(countVowels(input));
    }

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        // a e i o u
        String vowels = "aeiou";
        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}
