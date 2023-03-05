package com.tomspencerlondon.algorithms.educative.greedy.problem5.greedy;

import java.util.ArrayList;
import java.util.List;

public class MaxThieves {
    public static void main(String[] args) {
        char[] policeThiefArray = {'P', 'T', 'T', 'P', 'T'};
        System.out.println("Maximum thieves caught for {P, T, T, P, T}: " + policeThief(policeThiefArray,2));

        char[] policeThiefArray1 = {'T', 'T', 'P', 'P', 'T', 'P'};
        System.out.println("Maximum thieves caught for {T, T, P, P, T,P}: " + policeThief(policeThiefArray1, 2));

    }

    private static int policeThief(char[] copsAndRobbers, int unitsAway) {
        int result = 0;
        List<Integer> thieves = new ArrayList<>();
        List<Integer> police = new ArrayList<>();

        int n = copsAndRobbers.length;

        for (int i = 0; i < n; i++) {
            if (copsAndRobbers[i] == 'P') {
                police.add(i);
            } else if (copsAndRobbers[i] == 'T') {
                thieves.add(i);
            }
        }

        int trackThieves = 0;
        int trackPolice = 0;

        while (trackThieves < thieves.size() && trackPolice < police.size()) {
            if (Math.abs(thieves.get(trackThieves) - police.get(trackPolice)) <= unitsAway) {
                result++;
                trackThieves++;
                trackPolice++;
            } else if (thieves.get(trackThieves) < police.get(trackPolice)) {
                trackThieves++;
            } else {
                trackPolice++;
            }
        }

        return result;
    }


}
