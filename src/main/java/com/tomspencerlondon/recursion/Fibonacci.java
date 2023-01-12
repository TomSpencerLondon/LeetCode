package com.tomspencerlondon.recursion;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        fib(1000000000);
    }

    private static BigInteger fib(int n) {
        return fib(BigInteger.ONE, BigInteger.ONE, n);
    }

    private static BigInteger fib(BigInteger fm2, BigInteger fm1, int n) {
        if (n > 1) {
            System.out.println("Inside return: " + n);
            System.out.println("result: " + fm1.add(fm2));
            return fib(fm1, fm1.add(fm2), n - 1);
        } else {
            return fm1;
        }

    }
}
