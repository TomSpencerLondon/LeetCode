package com.tomspencerlondon.algorithms.educative.graphs.twinklerevision.numberOfIslands;

import java.util.LinkedList;

import java.util.Queue;

public class Main {
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static void main(String[] args) {
        String[][] matrix = {
                {"1", "1", "0", "0", "0"},
                {"0", "1", "0", "0", "1"},
                {"1", "0", "0", "1", "1"},
                {"0", "0", "0", "0", "0"},
                {"1", "0", "1", "0", "0"}
        };

        System.out.println(numberOfIslands(matrix));
    }

    private static int numberOfIslands(String[][] matrix) {
        int islands = 0;
        if (matrix == null || matrix.length == 0) {
            return islands;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("1")) {
                    islands++;
                    fillWithWater(matrix, rows, cols, i, j);
                }
            }
        }

        return islands;
    }

    private static void fillWithWater(String[][] matrix, int rows, int cols, int i, int j) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(i * cols + j);

        matrix[i][j] = "0";

        while (!queue.isEmpty()) {
            int index = queue.poll();
            int row = index / cols;
            int col = index % cols;

            for (int[] direction : DIRECTIONS) {
                int x = direction[0] + row;
                int y = direction[1] + col;

                if (x > -1 && x < rows && y > -1 && y < cols && matrix[x][y].equals("1")) {
                    matrix[x][y] = "0";
                    queue.add(x * cols + y);
                }
            }
        }
    }
}
