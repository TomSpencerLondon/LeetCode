package com.tomspencerlondon.algorithms.educative.divideConquer.euclidean;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(8, 24));
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        int temp = a;
        a = b % a;
        b = temp;

        return gcd(a, b);
    }
}
