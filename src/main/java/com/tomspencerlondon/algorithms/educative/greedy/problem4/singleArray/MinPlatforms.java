package com.tomspencerlondon.algorithms.educative.greedy.problem4.singleArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinPlatforms {

    private static class Scheduled {
        private int time;
        private String action;

        public Scheduled(int time, String action) {
            this.time = time;
            this.action = action;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }
    }
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minPlatforms(arrival, departure));
    }

    private static int minPlatforms(int[] arrivals, int[] departures) {
        List<Scheduled> schedules = Stream.concat(createSchedules(arrivals, "A"), createSchedules(departures, "D"))
                .sorted(Comparator.comparingInt(Scheduled::getTime))
                .toList();

        int currentNumberOfPlatforms = 0;
        int result = 0;

        for (Scheduled schedule : schedules) {
            if (schedule.getAction().equals("A")) {
                currentNumberOfPlatforms++;
            } else {
                currentNumberOfPlatforms--;
            }

            result = Math.max(result, currentNumberOfPlatforms);
        }

        return result;
    }

    private static Stream<Scheduled> createSchedules(int[] trains, String action) {
        return Arrays.stream(trains).mapToObj(arrival -> new Scheduled(arrival, action));
    }
}
