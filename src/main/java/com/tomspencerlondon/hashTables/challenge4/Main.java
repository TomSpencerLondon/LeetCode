package com.tomspencerlondon.hashTables.challenge4;

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

    public static String tracePath(Map<String, String> map) {
        StringBuilder result = new StringBuilder();
        String first = "Boston";
        String second = map.get(first);
        while(!map.isEmpty()) {
            result.append(first + "->" + second + ", ");
            map.remove(first);
            first = second;
            second = map.get(first);
        }

        return result.toString();
    }
}
