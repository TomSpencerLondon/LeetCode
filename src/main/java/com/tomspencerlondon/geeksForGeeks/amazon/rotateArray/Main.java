package com.tomspencerlondon.geeksForGeeks.amazon.rotateArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        rotateArr(array, 2, array.length);

        System.out.println(Arrays.toString(array));
    }

    private static void rotateArr(int arr[], int d, int n){
        // (i - d) % n

        int rotations = d % n;
        // add your code here
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[(i + n  - rotations) % n] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArray[i];
        }
    }

}
