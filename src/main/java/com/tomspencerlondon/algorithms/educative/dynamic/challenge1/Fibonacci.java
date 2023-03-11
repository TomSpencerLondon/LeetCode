package com.tomspencerlondon.algorithms.educative.dynamic.challenge1;

public class Fibonacci {
    public static void main(String[] args) {
        int input = 100;
        long[] fibs = new long[input + 1];
        System.out.println(fib(input, fibs));
    }

    private static long fib(int input, long[] fibs) {
        if (input == 0) {
            return 0;
        }

        if (input == 1 || input == 2) {
            fibs[1] = 1;
            fibs[2] = 1;
            return fibs[input];
        }

        if (fibs[input] != 0) {
            return fibs[input];
        } else {
            fibs[input] = fib(input - 1, fibs) + fib(input - 2, fibs);

            return fibs[input];
        }
    }
}
