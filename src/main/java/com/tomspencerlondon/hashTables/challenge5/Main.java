package com.tomspencerlondon.hashTables.challenge5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 7, 1, 12, 9};

        System.out.println(findPair(array));
    }

    private static String findPair(int[] array) {
        StringBuilder result = new StringBuilder();
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];

                if (!map.containsKey(sum)) {
                    map.put(sum, new int[]{array[i], array[j]});
                } else {
                    int[] previous = map.get(sum);
                    result.append("{" + previous[0] + "," + previous[1] + "}, {" + array[i] + "," + array[j] + "}");
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
}
