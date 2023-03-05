package com.tomspencerlondon.algorithms.educative.greedy.freeCodeCamp.meetingRooms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class MeetingRooms {
    static class Pair {
        private int time;
        private int value;

        public Pair(int time, int end) {
            this.time = time;
            this.value = end;
        }

        public int getTime() {
            return time;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        int[][] input = {{5, 10}, {15, 20}, {0, 30}};
        int[][] input2 = {{0, 100000000}, {15, 20}, {5, 30}};

        System.out.println(minimumRooms(input2));
    }

    private static int minimumRooms(int[][] input) {
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            pairs.add(new Pair(input[i][0], 1));
            pairs.add(new Pair(input[i][1], -1));
        }

        Collections.sort(pairs, Comparator.comparing(Pair::getTime));

        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (Pair pair : pairs) {
            curr += pair.getValue();
            max = Math.max(curr, max);
        }

        return max;
    }
}
