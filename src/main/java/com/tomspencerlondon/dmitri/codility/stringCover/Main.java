package com.tomspencerlondon.dmitri.codility.stringCover;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution("abcec", "bcdaf"));
    }

    public static int solution(String P, String Q) {
        Set<Character> set = new HashSet<>();
        List<Set> list = new ArrayList<>();
        list.add(set);

        for (int i = 0; i < P.length(); i++) {
            char p = P.charAt(i);
            char q = Q.charAt(i);

            List<Set> newList = new ArrayList<>();

            for (Set s : list) {
                if (!s.contains(p) && !s.contains(q)) {
                    Set<Character> newSet = new HashSet<>();
                    newSet.addAll(s);
                    s.add(p);
                    newSet.add(q);
                    newList.add(newSet);
                }
            }

            list.addAll(newList);


        }

        return list.stream().map(Set::size).min(Integer::compare).get();
    }
}
