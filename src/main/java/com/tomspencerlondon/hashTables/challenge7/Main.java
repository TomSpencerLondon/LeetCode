package com.tomspencerlondon.hashTables.challenge7;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = {9, 2, 3, 2, 6, 6};

        System.out.println(findFirstUnique(array));
    }

    private static int findFirstUnique(int[] array) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : array) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int num : array) {
            if (count.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }


}
