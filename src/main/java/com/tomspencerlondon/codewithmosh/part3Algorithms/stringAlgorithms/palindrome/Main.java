package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.palindrome;

public class Main {
    public static void main(String[] args) {
        String input = "abccba";

        System.out.println(isPalindrome2(input));
    }

    public static boolean isPalindrome2(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(String word) {
        StringBuilder input = new StringBuilder(word);
        input.reverse();

        return input.toString().equals(word);
    }
}
