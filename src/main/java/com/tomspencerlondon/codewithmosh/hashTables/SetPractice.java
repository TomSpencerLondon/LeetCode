package com.tomspencerlondon.codewithmosh.hashTables;

import com.tomspencerlondon.sedgewick.In;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] numbers = {1, 2, 3, 3, 2, 1, 4};

        for (int number : numbers) {
            set.add(number);
        }

        System.out.println(set);
    }
}
