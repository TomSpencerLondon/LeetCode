package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.palindrome;

public class Main {
    public static void main(String[] args) {
        String input = "abccba";

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String word) {
        StringBuilder input = new StringBuilder(word);
        input.reverse();

        return input.toString().equals(word);
    }
}
