package com.tomspencerlondon.hashTables.challenge6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 4, -7, 3, 12, 9};

        System.out.println(findSubZero(array));

    }

    public static boolean findSubZero(int[] arr) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || map.get(sum) != null) {
                return true;
            }

            map.put(sum, i);
        }

        return false;
    }
}
