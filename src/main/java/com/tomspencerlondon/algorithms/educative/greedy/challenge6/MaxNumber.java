package com.tomspencerlondon.algorithms.educative.greedy.challenge6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MaxNumber {
    public static void main(String[] args) {
        findLargestNumber(21, 4);
    }

    private static void findLargestNumber(int sum, int numberOfDigits) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numberOfDigits; i++) {
            if (sum >= 9) {
                result.add(9);
                sum -= 9;
            } else {
                result.add(sum);
                sum = 0;
            }
        }

        System.out.println(result);
    }
}
