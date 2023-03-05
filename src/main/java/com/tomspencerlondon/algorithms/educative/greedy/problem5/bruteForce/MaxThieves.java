package com.tomspencerlondon.algorithms.educative.greedy.problem5.bruteForce;

public class MaxThieves {
    public static void main(String[] args) {
        char[] policeThiefArray = {'P', 'T', 'T', 'P', 'T'};
        System.out.println("Maximum thieves caught for {P, T, T, P, T}: " + policeThief(policeThiefArray,2));
        char[] policeThiefArray1 = {'T', 'T', 'P', 'P', 'T', 'P'};
        System.out.println("Maximum thieves caught for {T, T, P, P, T,P}: " + policeThief(policeThiefArray1, 2));

    }

    private static int policeThief(char[] copsAndRobbers, int unitsAway) {
        int result = 0;
        boolean[] caught = new boolean[copsAndRobbers.length];

        for (int i = 0; i < copsAndRobbers.length; i++) {
            if (copsAndRobbers[i] == 'P' && !caught[i]) {
                for (int j = i; j < (j + unitsAway) && j < copsAndRobbers.length; j++) {
                    if (copsAndRobbers[j] == 'T' && !caught[j]) {
                        caught[i] = true;
                        caught[j] = true;
                        result++;

                        break;
                    }
                }
            }
            if (copsAndRobbers[i] == 'P' && !caught[i]) {
                for (int j = i; j > (j - unitsAway) && j >= 0; j--) {
                    if (copsAndRobbers[j] == 'T' && !caught[j]) {
                        caught[i] = true;
                        caught[j] = true;
                        result++;
                        break;
                    }
                }
            }
        }

        return result;

    }
}
