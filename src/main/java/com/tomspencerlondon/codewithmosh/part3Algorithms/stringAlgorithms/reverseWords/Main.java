package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.reverseWords;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String input = "Hello world my name is Tom";

        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }
}
