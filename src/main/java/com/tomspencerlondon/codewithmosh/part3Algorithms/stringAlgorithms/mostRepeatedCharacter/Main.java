package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.mostRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "Hello World";

        System.out.println(getMaxOccurringCharacter(input));
    }

    public static char getMaxOccurringCharacter(String str) {
        final int ASCII_SIZE = 256;

        int[] frequencies = new int[ASCII_SIZE];

        for (char ch : str.toCharArray()) {
            frequencies[ch]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }

        return result;
    }

    public static char getMaxOccuringChar(String str) {
        HashMap<Character, Integer> frequencies = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (frequencies.containsKey(ch)) {
                frequencies.replace(ch, frequencies.get(ch) + 1);
            } else {
                frequencies.put(ch, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        Character result = null;
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
