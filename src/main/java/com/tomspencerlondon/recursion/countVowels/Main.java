package com.tomspencerlondon.recursion.countVowels;

public class Main {

    public static void main(String[] args) {
        System.out.println(countVowels("abcde"));
    }


    private static int countVowels(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        int count = 0;

        if (text.charAt(0) == 'a' ||
                text.charAt(0) == 'e' ||
                text.charAt(0) == 'i' ||
                text.charAt(0) == 'o' ||
                text.charAt(0) == 'u') {
            count = 1;
        }

        return count + countVowels(text.substring(1));
    }
}
