package com.tomspencerlondon.algorithms.educative.dynamic.strings;

public class LongestCommonSubsequence {

    private static final String left = "adcbc";
    private static final String right = "dcadb";

    public static void main(String[] args) {
        // maintains order in the string
        //

        System.out.println(longestCommonSubsequence(left, right));
    }

    private static int longestCommonSubsequence(String left, String right) {
        int[][] dp = new int[left.length() + 1][right.length() + 1];

        for (int i = 0; i < left.length(); i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= left.length(); i++) {
            for (int j = 1; j <= right.length(); j++) {
                if (left.charAt(i - 1) == right.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[left.length()][right.length()];
    }
}
