package com.tomspencerlondon.codewithmosh.part1linear.hashTables;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "a green apple";

        System.out.println(firstNonDuplicate(input));
    }

    private static Character firstNonDuplicate(String input) {
        Map<Character, Integer> dups = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            dups.put(c, dups.getOrDefault(c, 0) + 1);
        }

        System.out.println(dups);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (dups.get(c) == 1) {
                return c;
            }
        }

        return Character.MIN_VALUE;
    }
}
