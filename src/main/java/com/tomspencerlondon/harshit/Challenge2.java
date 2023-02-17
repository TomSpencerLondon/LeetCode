package com.tomspencerlondon.harshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        // matrix -
        // [
        //  [1, 2, 3, 4]
        //  [5, 6, 7, 8]
        // [9, 10, 11, 12]
        // [13, 14, 15, 16]
        // ]
        // convert matrix into an array
        // condition:
        //  convert into one dimension array
        // - spiral form
        //  [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

        int[][] input = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };



//        System.out.println(Arrays.toString(spiralForm(input)));
        System.out.println(spiralOrder(input));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) {
            return result;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;


        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

            for (int i = columnBegin; i <= columnEnd; i++) {
                result.add(matrix[rowBegin][i]);
            }

            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[i][columnEnd]);
            }

            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    result.add(matrix[rowEnd][i]);
                }

                rowEnd--;

                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][columnBegin]);
                }

                columnBegin++;
            }
        }

        return result;
    }

    public static int[] spiralForm(int[][] array) {
        int[] result = new int[array.length * array[0].length];
        int index = 0;

        int rightBoundary = array[0].length;
        int bottomBoundary = array.length;
        int leftBoundary = 0;
        int topBoundary = 0;

        while (index < (bottomBoundary * rightBoundary)) {
            for (int j = 0; j < rightBoundary; j++) {
                result[index++] = array[0][j];
            }

            for (int i = 1; i < bottomBoundary; i++) {
                result[index++] = array[i][array[0].length - 1];
            }

            rightBoundary = rightBoundary - 2;

            for (int i = rightBoundary; i > leftBoundary; i--) {
                result[index++] = array[array.length - 1][i];
            }

            bottomBoundary = bottomBoundary - 1;

            for (int i = bottomBoundary; i > topBoundary; i--) {
                result[index++] = array[i][0];
            }
        }


        return result;
    }
}
