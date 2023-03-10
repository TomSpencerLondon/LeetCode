package com.tomspencerlondon.algorithms.educative.greedy.problem3.attempt3;

import java.util.ArrayList;
import java.util.List;

public class EgyptianFraction {

    public static void main(String[] args) {
        System.out.println(printEgyptianFraction(7, 15));
    }

    private static String printEgyptianFraction(int numerator, int denominator) {
        // your code
        List<String> result = new ArrayList<>();
        if (numerator > denominator) {
            int i = numerator / denominator;
            result.add(String.valueOf(i));
            numerator = numerator - i * denominator;
        }

        while (numerator != 0) {
            int i = (int) Math.ceil((double) denominator / numerator);
            result.add("1/" + i);
            numerator = numerator * i - denominator;
            denominator = denominator * i;
        }
        return result.toString();
    }
}
