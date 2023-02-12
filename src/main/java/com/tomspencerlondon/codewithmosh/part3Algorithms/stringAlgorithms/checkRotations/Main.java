package com.tomspencerlondon.codewithmosh.part3Algorithms.stringAlgorithms.checkRotations;

public class Main {
    public static void main(String[] args) {
        // ABCD -> DABC
        //      -> CDAB
        //      -> BCDA
        //      -> ABCD

        System.out.println(areRotations("ABCD", "DABC"));
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        return (str1.length() == str2.length() &&
                (str1 + str1).contains(str2));
    }
}
