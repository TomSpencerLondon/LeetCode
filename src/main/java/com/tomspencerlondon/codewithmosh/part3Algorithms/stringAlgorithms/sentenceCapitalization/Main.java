package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.sentenceCapitalization;

public class Main {
    public static void main(String[] args) {
        System.out.println(capitalize("today is a great day"));
    }

    public static String capitalize(String sentence) {
        String[] words = sentence.trim()
                .replaceAll(" +", " ")
                .split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }
}
