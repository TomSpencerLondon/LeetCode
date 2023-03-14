package com.tomspencerlondon.algorithms.educative.dynamic.shortestCommonSuperstring;

public class ShortestCommonSupersequence {

    public static void main(String[] args) {
        String first = "abcf";
        String second = "bdcf";
        // Supersequence is a string which contains both the
        // subsequences
        // abcf and bdcf as two different subsequence
        // the longest supersequence = abcfbdcf
        // the shortest length supersequence becomes
        // abdcf
        System.out.println(shortestCommonSupersequence(first, second));
    }

    private static int shortestCommonSupersequence(String first, String second) {
        int[][] dp = new int[first.length() + 1][second.length() + 1];

        for (int i = 0; i <= first.length(); i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= second.length(); i++) {
            dp[0][i] = i;
        }



        for (int row = 1; row <= first.length(); row++) {
            for (int col = 1; col <= second.length(); col++) {
                int minLength = Math.min(dp[row - 1][col], dp[row][col - 1]);
                if(first.charAt(row - 1) == second.charAt(col - 1)) {
                    dp[row][col] = minLength;
                } else {
                    dp[row][col] = minLength + 1;
                }
            }
        }

        return dp[first.length()][second.length()];
    }
}
