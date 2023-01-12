package com.tomspencerlondon.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Challenge7 {
// Challenge 7: Find Second Maximum Value in an Array
// Given an array of size n, can you find the second maximum element in the array?
// Implement your solution in Java and see if your output matches the correct output!
//

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(findSecondMax(arr));
    }

    private static int findSecondMax(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(arr[0]);
        deque.addLast(arr[1]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > deque.peekFirst()) {
                deque.addFirst(arr[i]);
            } else if (arr[i] > deque.peekLast()) {
                deque.pollLast();
                deque.addLast(arr[i]);
            }
        }

        deque.pollFirst();
        return deque.pollFirst();
    }
}
