package com.tomspencerlondon.stacks;

import java.util.Arrays;

public class Challenge7 {

    public static void main(String[] args) {
        // next greater element using stack
        //

        System.out.println(Arrays.toString(nextGreaterElementNested(new int[]{1, 3, 8, 4, 10, 5})));
    }

    public static int[] nextGreaterElementNested(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }
}
