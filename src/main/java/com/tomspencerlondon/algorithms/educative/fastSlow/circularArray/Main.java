package com.tomspencerlondon.algorithms.educative.fastSlow.circularArray;

public class Main {

    public static void main(String[] args) {
        System.out.println(circularArrayLoop(new int[]{5, 4, -2, -1, 3}));
    }


    public static boolean circularArrayLoop(int[] nums) {
        int direction = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                direction = 1;
            } else {
                direction = -1;
            }

            if (isCyclePresent(nums, i, direction)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isCyclePresent(int[] nums, int position, int direction) {
        int start = (position + nums[position]) % nums.length;

        if (start == position) {
            return false;
        }

        if (start < 0) {
            start = start + nums.length;
        }

        while (start != position) {
            if (nums[start] > 0 && direction == -1) {
                return false;
            } else if (nums[start] < 0 && direction == 1) {
                return false;
            }

            start = (start + nums[start]) % nums.length;

            if (start < 0) {
                start = start + nums.length;
            }
        }

        return true;
    }
}
