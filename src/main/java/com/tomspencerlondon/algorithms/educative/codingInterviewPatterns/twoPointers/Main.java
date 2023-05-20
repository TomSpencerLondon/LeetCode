package com.tomspencerlondon.algorithms.educative.codingInterviewPatterns.twoPointers;

public class Main {

    public static void main(String[] args) {
        String sentence = "Hello world";
        System.out.println(reverseSentence(sentence));
    }

    private static String reverseSentence(String sentence) {
        String first = reverseString(sentence);
        StringBuilder result = new StringBuilder();
        for (String word : first.split(" ")) {
            String individual = reverseString(word);
            result.append(individual);
            result.append(" ");
        }

        return result.toString().trim();
    }


    public static String reverseString(String myStr) {
        // Base case
        if (myStr.isEmpty()) {
            return myStr;
        }

        // Recursive case
        else {
            return reverseString(myStr.substring(1)) + myStr.charAt(0);
        }
    }
}
