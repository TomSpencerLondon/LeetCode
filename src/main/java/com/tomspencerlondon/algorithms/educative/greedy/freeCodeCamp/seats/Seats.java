package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.seats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Seats {

    public static void main(String[] args) {
        String seats = "..x..x.";
        String seats2 = ".x..x..xx";
        String seats3 = ".x..x..xx.";
        System.out.println(minimumMovesToSitTogether(seats2));
    }

    private static int minimumMovesToSitTogether(String input) {
        int mod = 10000003;
        List<Integer> crosses = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == 'x') {
                crosses.add(i);
            }
        }

        List<Integer> list = new ArrayList<>();
        int bound = crosses.size();
        for (int i = 0; i < bound; i++) {
            Integer integer = crosses.get(i) - i;
            list.add(integer);
        }

        crosses = list;

        int n = crosses.size();
        if (n == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < input.length(); i++) {
            int total = 0;

            for (Integer cross : crosses) {
                total += Math.abs(cross - i);
                total %= mod;
            }

            result = Math.min(result, total % mod);
        }

        return result;
    }


}
