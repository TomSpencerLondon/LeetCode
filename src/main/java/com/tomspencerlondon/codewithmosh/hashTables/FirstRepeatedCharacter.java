package com.tomspencerlondon.codewithmosh.hashTables;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        String input = "green apple";

        System.out.println(firstRepeatedCharacter(input));
    }

    private static Character firstRepeatedCharacter(String input) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (set.contains(c)) {
                return c;
            }
            set.add(c);
        }

        return Character.MIN_VALUE;
    }
}
