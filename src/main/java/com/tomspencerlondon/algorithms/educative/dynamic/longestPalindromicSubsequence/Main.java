package com.tomspencerlondon.algorithms.educative.dynamic.longestPalindromicSubsequence;

public class Main {

    public static void main(String[] args) {
        // expected = 5
//        String palindromicSubsequence = "agbdba";
        String palindromicSubsequence = "cddpd";


        System.out.println(longestPalindromicSubsequence(palindromicSubsequence));
    }

    private static int longestPalindromicSubsequence(String input) {

        int[][] dp = new int[input.length()][input.length()];

        for (int i = 0; i < input.length(); i++) {
            dp[i][i] = 1;
        }

        for (int col = 1; col < input.length(); col++) {
            int temp = col;
            int row = 0;
            while (col < input.length()) {
                if (input.charAt(row) == input.charAt(col)) {
                    dp[row][col] = 2 + dp[row + 1][col - 1];
                } else {
                    dp[row][col] = Math.max(dp[row][col - 1], dp[row + 1][col]);
                }

                row++;
                col++;
            }

            col = temp;
        }


        return dp[0][input.length() - 1];
    }
}
