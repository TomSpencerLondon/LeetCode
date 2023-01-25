package com.tomspencerlondon.codewithmosh.part1linear.hashTables;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        String input = "green apple";

        System.out.println(firstRepeatedCharacter(input));
    }

    private static Character firstRepeatedCharacter(String input) {
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (set.contains(c)) {
                return c;
            }
            set.add(c);
        }

        return Character.MIN_VALUE;
    }
}
