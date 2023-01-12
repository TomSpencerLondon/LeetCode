package com.tomspencerlondon.recursion;

public class Fibonacci2 {
    public static void main(String[] args) {
        nthFibonacci(1000);
    }
    static long nthFibonacci(long n){
        // code here
        long[] storage = new long[(int) n + 1];

        return fibonacci(n, storage);
    }

    static long fibonacci(long n, long[] storage) {
        if (n == 1 || n == 2) {
            return 1;
        }

        if (storage[(int) n] == 0) {
            storage[(int) n] = (fibonacci(n - 1, storage) + fibonacci(n - 2, storage))%1000000007;
        }

        return storage[(int) n];
    }
}
