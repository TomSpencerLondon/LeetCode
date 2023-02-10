package com.tomspencerlondon.heaps.kLargest;

public class Main {

    public static void main(String[] args) {
        int[] input = {9, 4, 7, 1, -2, 6, 5};
        int[] output = findKLargest(input, 3);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    private static int[] findKLargest(int[] arr, int k) {
        int arraySize = arr.length;
        if (k <= arraySize) {
            int[] result = new int[k];

            for (int i = 0; i < k; i++) {
                buildMaxHeap(arr, arraySize);
                result[i] = arr[0];
                arr[0] = arr[--arraySize];
            }

            return result;
        }

        return arr;
    }

    private static void buildMaxHeap(int[] heapArray, int heapSize) {
        for (int i = (heapSize - 1) / 2; i >= 0; i--) {
            maxHeapify(heapArray, i, heapSize);
        }
    }

    private static void maxHeapify(int[] heapArray, int index, int heapSize) {
        int largest = index;

        while (largest < heapSize / 2) {
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;

            if (left < heapSize && heapArray[left] > heapArray[index]) {
                largest = left;
            }

            if (right < heapSize && heapArray[right] > heapArray[largest]) {
                largest = right;
            }

            if (largest != index) {
                int temp = heapArray[index];
                heapArray[index] = heapArray[largest];
                heapArray[largest] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }
}
