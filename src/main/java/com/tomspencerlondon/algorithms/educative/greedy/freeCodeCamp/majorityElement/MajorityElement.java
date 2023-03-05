package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] elements = {3, 5, 5, 4, 5, 5};

        System.out.println(majorityElement(elements));
    }

    private static int majorityElement(int[] elements) {
        int numBits = 32;
        int number = 0;

        for (int i = 0; i < numBits; i++) {
            int ones = 0;
            for (int element : elements) {
                if ((element & (1 << i)) != 0) {
                    ones++;
                }
            }

            if (ones > elements.length / 2) {
                number |= (1 << i);
            }
        }

        return number;
    }

    private static int majorityElementNaive(int[] elements) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : elements) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > elements.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }


}
