package com.tomspencerlondon.algorithms.educative.dynamic.editDistance;

public class Main {

    public static void main(String[] args) {
        String str1 = "Tuesday";
        String str2 = "Thursday";

        System.out.println(minEditDistance(str1, str2));
    }

    public static int min(int a, int b, int c) // Helper function to find minimum of 3 integers
    {
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        else return c;
    }

    public static int minEditDistance(String str1, String str2) {
        // your awesome code goes here!
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= str2.length(); i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
                }
            }
        }


        return dp[str1.length()][str2.length()];
    }
}
