package com.tomspencerlondon.stacks;

import java.util.Arrays;

public class Challenge1 {
    public static void main(String[] args) {
        // Generate Binary Numbers from 1 to n using a Queue
        String[] result = binaryNumbersTo(10);
        System.out.println(Arrays.toString(result));
    }

    public static String[] binaryNumbersTo(int n) {
        Queue<String> queue = new Queue<>(10);
        queue.enqueue("1");
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String number = queue.dequeue();
            result[i] = number;
            queue.enqueue(number + "0");
            queue.enqueue(number + "1");
        }

        return result;
    }
}
