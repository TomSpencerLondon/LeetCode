package com.tomspencerlondon.dmitri.codility.binaryGap;

public class Main {
    public static void main(String[] args) {
        // 9 = 1001 gaps = 2
        // 529 = 1000010001 gaps = 4
        // 20 = 10100 gaps = 1
        // 15 = 1111 gaps = 0
        // 32 = 100000 gaps = 0
        // 1041 = 10000010001 gaps = 5


        System.out.println(binaryGap(15));
    }

    private static int binaryGap(int N){
        String binaryString = Integer.toBinaryString(N);

        int maxGap = 0;
        int currentGap = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            } else {
                currentGap++;
            }
        }

        return maxGap;
    }
}
