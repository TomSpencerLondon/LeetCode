package com.tomspencerlondon.algorithms.educative.dynamic.longestPalindromicString;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String words = "thereisaradaranditisapalindrome";
        String reversed = new StringBuilder(words).reverse().toString();
        System.out.println(longestCommonSubstring(words, reversed));
    }

    private static int longestCommonSubstring(String first, String second) {
        int[][] dp = new int[first.length() + 1][second.length() + 1];
        for (int i = 1; i < second.length(); i++) {
            if (second.charAt(i) == first.charAt(0)) {
                dp[0][i] = 1;
            }
        }

        int answer = -1;
        for (int i = 1; i <= first.length(); i++) {
            for (int j = 1; j <= second.length(); j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }

                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }

}
