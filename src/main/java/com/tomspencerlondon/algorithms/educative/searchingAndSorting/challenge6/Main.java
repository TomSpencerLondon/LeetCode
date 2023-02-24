package com.tomspencerlondon.algorithms.educative.searchingAndSorting.challenge6;

public class Main {

    public static void main(String[] args) {
        int[][] matrix  = {
                {10, 11, 12, 13},
                {14, 15, 16, 17},
                {27, 29, 30, 31},
                {32, 33, 39, 80}
        };

        int target = 12;

        System.out.println(findKey(matrix, target));
    }

    private static boolean findKey(int[][] matrix, int target) {
        int column = 0;
        int row = matrix.length - 1;

        while (column < matrix[0].length && row >= 0) {
            if (matrix[row][column] == target) {
                return true;
            }

            if (matrix[row][column] > target) {
                row--;
            } else {
                column++;
            }
        }

        return false;
    }


}
