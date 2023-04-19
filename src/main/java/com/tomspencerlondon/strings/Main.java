package com.tomspencerlondon.strings;

import java.util.*;

class Main {
    // minimum = Integer.MAX_VALUE
    // ca
    // ab
    //  ^
    // aa

    // ac
    // ab
    //

    // abc
    // bcd
    //   ^
    // bbc

    // bacad
    // abada
    //     ^
    // aaaaa

    // amz
    // amz
    //   ^
    // amz

    public static void main(String[] args) {
        System.out.println(solution("abcec", "bcdaf"));
    }

    public static int solution(String first, String second) {
        Set<Character> distinctLetters = new HashSet<>();
        int numDistinct = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                distinctLetters.add(first.charAt(i));
            } else {
                distinctLetters.add(first.charAt(i));
                distinctLetters.add(second.charAt(i));
            }
        }
        numDistinct = distinctLetters.size();
        for (char c : distinctLetters) {
            Set<Character> temp = new HashSet<>();
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) == c || second.charAt(i) == c) {
                    temp.add(c);
                } else {
                    temp.add(first.charAt(i));
                    temp.add(second.charAt(i));
                }
            }
            numDistinct = Math.min(numDistinct, temp.size());
        }
        return numDistinct;
    }
}
