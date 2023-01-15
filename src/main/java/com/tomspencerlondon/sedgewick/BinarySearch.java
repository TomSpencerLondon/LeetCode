package com.tomspencerlondon.sedgewick;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        In in = new In(args[0]);

        int[] whitelist = in.readInts();

        Arrays.sort(whitelist);
    }
}
