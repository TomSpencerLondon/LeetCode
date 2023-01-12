package com.tomspencerlondon.recursion;

import java.math.BigInteger;

public class Fibonacci3 {

    public static void main(String[] args) {
        System.out.println(fib(100000));
    }

    static BigInteger fib(int n) {
        BigInteger fm2 = BigInteger.ONE;
        BigInteger fm1 = BigInteger.ONE;
        while (n>1) {
            BigInteger f = fm1.add(fm2);
            fm2 = fm1;
            fm1 = f;
            n--;
        }
        return fm1;
    }
}
