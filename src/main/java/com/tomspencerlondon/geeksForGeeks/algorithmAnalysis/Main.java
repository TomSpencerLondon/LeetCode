package com.tomspencerlondon.geeksForGeeks.algorithmAnalysis;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumN2(5));
    }

    private static int sumN2(int n) {
        return n * (n + 1) / 2;
    }

    private static int sumN(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }
}
