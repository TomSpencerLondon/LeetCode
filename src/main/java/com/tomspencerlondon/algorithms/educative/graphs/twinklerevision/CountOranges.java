package com.tomspencerlondon.algorithms.educative.graphs.twinklerevision;

import java.util.LinkedList;
import java.util.Queue;

public class CountOranges {

    public static void main(String[] args) {
        int[][] grid =  {
                {0,1,2},
                {0,1,2},
                {2,1,1}
        };

        System.out.println(orangesRotting(grid));

    }
    static class Pair {
        private int day;
        private int[] indices;

        public Pair(int day, int[] indices) {
            this.day = day;
            this.indices = indices;
        }

        public int getDay() {
            return this.day;
        }

        public int[] getIndices() {
            return this.indices;
        }

    }

    //Function to find minimum time required to rot all oranges.
    public static int orangesRotting(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<Pair> queue = new LinkedList<>();
        Queue<Pair> ones = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2 && !visited[i][j]) {
                    queue.add(new Pair(0, new int[]{i, j}));

                }

                if (grid[i][j] == 1 && !visited[i][j]) {
                    ones.add(new Pair(0, new int[]{i, j}));
                }
            }
        }

        int time = -1;

        while (!queue.isEmpty()) {
            Pair current = queue.remove();
            time = current.getDay();

            int[] horizontalDirection = {0, 1, 0, -1};
            int[] verticalDirection = {-1, 0, 1, 0};

            for (int direction = 0; direction < 4; direction++) {
                int newI = current.getIndices()[0] + horizontalDirection[direction];
                int newJ = current.getIndices()[1] + verticalDirection[direction];

                if (newI >= 0 && newI < grid.length && newJ >= 0 && newJ < grid[0].length) {
                    if (grid[newI][newJ] == 1 && !visited[newI][newJ]) {
                        visited[newI][newJ] = true;
                        queue.add(new Pair(time + 1, new int[]{newI, newJ}));
                        ones.remove();
                    }
                }


            }
        }

        if (ones.isEmpty()) {
            return time;
        } else {
            return -1;
        }
    }
}
