package com.tomspencerlondon.harshit;

import java.util.Arrays;

public class Challenge3 {

    public static void main(String[] args) {
        // [
        //  [1, 2, 3, 4]
        //  [5, 6, 7, 8]
        //  [9, 10, 11, 12]
        // ]
        int[][] array = new int[][]{
                {10, 20, 30, 40},
                {15, 25, 35, 46},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        System.out.println(Arrays.toString(position(array, 35)));
    }

    private static int[] position(int[][] array, int target) {
        int column = 0;
        int row = array.length - 1;
        int[] result = new int[2];

        while (column < array[0].length && row >= 0) {
            if (array[column][row] == target) {
                result[0] = column;
                result[1] = row;

                return result;
            }

            if (array[column][row] > target) {
                row--;
            } else {
                column++;
            }
        }

        return new int[]{-1, -1};
    }
}
