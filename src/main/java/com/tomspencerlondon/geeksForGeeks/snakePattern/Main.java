package com.tomspencerlondon.geeksForGeeks.snakePattern;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // expected [1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12, 16, 15, 14, 13]
        printSnakePattern(array);

    }

    private static void printSnakePattern(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + ", ");
                }
            } else {
                for (int j = array.length - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
    }
}
