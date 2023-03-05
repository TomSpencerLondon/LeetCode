package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.gasStations;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GasStation {
    public static void main(String[] args) {
        // if curr < 0
        // curr = 0
        // start = i + 1
        // if start == start + n
        // return start

        int[] gas = {3, 5, 2, 1, 7};
        int[] cost = {4, 2, 1, 9, 1};
        System.out.println(firstGasStation(gas, cost));
    }

    private static int firstGasStation(int[] gas, int[] cost) {
        int length = gas.length;
        int curr = 0;
        int start = 0;
        int[] gasLengthened = IntStream
                .concat(Arrays.stream(gas), Arrays.stream(gas))
                .toArray();
        int[] costLengthened = IntStream
                .concat(Arrays.stream(cost), Arrays.stream(cost))
                .toArray();
        for (int i = 0; i < gasLengthened.length; i++) {
            if (i == (start + (length - 1))) {
                return start;
            }

            curr += gasLengthened[i] - costLengthened[i];

            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }

        return -1;
    }
}
