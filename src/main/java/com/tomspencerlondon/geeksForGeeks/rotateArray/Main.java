package com.tomspencerlondon.geeksForGeeks.rotateArray;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotateMatrixRight(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        rotateMatrixLeft(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static void rotateMatrixRight(int[][] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = array[i][j];
                array[i][j] = array[length - 1 - j][i];
                array[length - 1 - j][i] = array[length - 1 - i][length - 1 - j];
                array[length - 1 - i][length - 1 - j] = array[j][length - 1 - i];
                array[j][length - 1 - i] = temp;
            }
        }
    }

    private static void rotateMatrixLeft(int[][] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][length - 1 - i];
                array[j][length - 1 - i] = array[length - 1 - i][length - 1 - j];
                array[length - 1 - i][length - 1 - j] = array[length - 1 - j][i];
                array[length - 1 - j][i] = temp;
            }
        }
    }


}
