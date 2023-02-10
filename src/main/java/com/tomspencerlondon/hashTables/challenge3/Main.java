package com.tomspencerlondon.hashTables.challenge3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
        String symmetric = findSymmetric(arr);
        System.out.println(symmetric);
    }

    private static String findSymmetric(int[][] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            Integer value = map.get(second);

            if (value != null && value == first) {
                result.append("{" + String.valueOf(second) + "," + String.valueOf(first) + "} ");
            } else {
                map.put(first, second);
            }
        }

        return result.toString();
    }
}
