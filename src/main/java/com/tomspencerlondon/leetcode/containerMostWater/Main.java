package com.tomspencerlondon.leetcode.containerMostWater;

public class Main {
    public static void main(String[] args) {
        int[] walls = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxWater(walls));
    }

    private static int maxWater(int[] walls) {
        int start = 0;
        int end = walls.length - 1;
        int result = 0;
        int temp = 0;

        while (start < end) {
            if (walls[start] <= walls[end]) {
                temp = walls[start] * (end - start);
                start++;
            } else {
                temp = walls[end] * (end - start);
                end--;
            }

            result = Math.max(result, temp);
        }

        return result;
    }
}
