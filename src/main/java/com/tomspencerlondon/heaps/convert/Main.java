package com.tomspencerlondon.heaps.convert;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] heapArray = {9, 4, 7, 1, -2, 6, 5};
        System.out.println("Max heap: " + Arrays.toString(heapArray));

        convertMax(heapArray);

        System.out.println("Min heap: " + Arrays.toString(heapArray));
    }

    private static void convertMax(int[] maxHeap) {

        buildMinHeap(maxHeap, maxHeap.length);
    }

    private static void buildMinHeap(int[] heapArray, int heapSize) {

        for (int i = (heapSize - 1) / 2; i >= 0; i--) {
            minHeapify(heapArray, i, heapSize);
        }
    }

    private static void minHeapify(int[] heapArray, int index, int heapSize) {
        int smallest = index;

        while (smallest < heapSize / 2) {
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;

            if (left < heapSize && heapArray[left] < heapArray[index]) {
                smallest = left;
            }

            if (right < heapSize && heapArray[right] < heapArray[smallest]) {
                smallest = right;
            }

            if (smallest != index) {
                int temp = heapArray[index];
                heapArray[index] = heapArray[smallest];
                heapArray[smallest] = temp;
                index = smallest;
            } else {
                break;
            }
        }
    }
}
