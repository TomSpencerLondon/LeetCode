package com.tomspencerlondon.hashTables.challenge4.educative;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("New York", "Chicago");
        map.put("Boston", "Texas");
        map.put("Missouri", "New York");
        map.put("Texas", "Missouri");

        System.out.println(tracePath(map));
    }

    private static String tracePath(Map<String, String> map) {
        String result = "";

        Map<String, String> reverseMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        String from = "Boston";
        int count = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!reverseMap.containsKey(entry.getValue())) {
                count++;
                from = entry.getKey();
            }
        }

        if (count > 1) {
            return "null";
        }

        String to = map.get(from);

        while (to != null) {
            result += from + "->" + to + ", ";
            from = to;
            to = map.get(to);
        }

        return result;
    }
}
