package com.tomspencerlondon.algorithms.educative.dynamic.stringsInterleaving;

public class Main {
    public static void main(String[] args) {
        String m = "mac";
        String n = "cat";

        String p = "mcacat";

        System.out.println(findSI(m, n, p));
    }

    private static boolean findSI(String m, String n, String p) {

        if (m.length() + n.length() != p.length()) {
            return false;
        }

        boolean[][] dp = new boolean[m.length() + 1][n.length() + 1];

        dp[0][0] = true;

        for (int i = 1; i <= n.length(); i++) {
            if (n.charAt(i - 1) == p.charAt(i - 1) && dp[0][i - 1]) {
                dp[0][i] = true;
            }
        }

        for (int i = 1; i <= m.length(); i++) {
            if (m.charAt(i - 1) == p.charAt(i - 1) && dp[i - 1][0]) {
                dp[i][0] = true;
            }
        }

        for (int i = 1; i <= m.length(); i++) {
            for (int j = 1; j <= n.length(); j++) {
                if (m.charAt(i - 1) == p.charAt(i + j - 1) && dp[i - 1][j]) {
                    dp[i][j] = true;
                } else if (n.charAt(j - 1) == p.charAt(i + j - 1) && dp[i][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[m.length()][n.length()];
    }
}
