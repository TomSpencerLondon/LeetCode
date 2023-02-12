package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.removeDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("Trees are beautiful"));
    }

    public static String removeDuplicates(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }
}
