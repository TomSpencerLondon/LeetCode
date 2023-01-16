package com.tomspencerlondon.arrays.jump;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

public class JumpPrint {

    public static void main(String[] args) {
        int[] array = new int[]{3, 3, 1, 1, 4};
        int[] array2 = new int[]{6,2,6,1,7,9,3,5,3,7,2,8,9,4,7,7,2,2,8,4,6,6,1,3};
        int[] secondArray = new int[]{3, 0, 1, 1, 4};
        int[] thirdArray = new int[]{1};
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Solution solution = new Solution();
        log("Min jumps = " + solution.jump(array2));
        stopWatch.stop();
        log("Time to execute = " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " milliseconds");
    }

    private static void log(String input) {
        System.out.println(input);
    }
}
