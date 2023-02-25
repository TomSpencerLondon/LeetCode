package com.tomspencerlondon.geeksForGeeks.amazon.squareRoot;

public class Main {

    public static void main(String[] args) {
        System.out.println(floorSqrt(11));
    }

    private static long floorSqrt(long x) {
        long low = 0;
        long high = x / 2;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (mid * mid == x) {
                return mid;
            }

            if (mid * mid < x) {
                low = mid + 1;
                result = mid;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
