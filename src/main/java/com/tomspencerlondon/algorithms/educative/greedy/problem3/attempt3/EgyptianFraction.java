package com.tomspencerlondon.algorithms.educative.greedy.problem3.attempt3;

public class EgyptianFraction {

    public static void main(String[] args) {
        printEgyptianFraction(2, 3);
    }

    private static void printEgyptianFraction(int numerator, int denominator) {
        if (numerator == 0 || denominator == 0) {
            return;
        }

        if (denominator % numerator == 0) {
            System.out.println("1/" + denominator / numerator);
            return;
        }

        if (numerator % denominator == 0) {
            System.out.println(numerator / denominator);
            return;
        }

        if (numerator > denominator) {
            System.out.println(numerator / denominator + ", ");
            printEgyptianFraction(numerator % denominator, denominator);
            return;
        }

        int n = denominator / numerator + 1;

        System.out.println("1/" + n + ", ");

        printEgyptianFraction(numerator * n - denominator, denominator);
    }
}
