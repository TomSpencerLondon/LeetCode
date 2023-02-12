package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.mostRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "Hello World";

        System.out.println(getMaxOccuringChar(input));
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
