package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.heaps.heapify;

public class MaxHeap {

    public static void heapify(int[] array) {
        int lastParentIndex = array.length / 2 - 1;
        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array, i);
        }
    }

    private static void heapify(int[] array, int index) {
        int largerIndex = index;

        int leftIndex = index * 2 + 1;

        if (leftIndex < array.length && array[leftIndex] > array[largerIndex]) {
            largerIndex = leftIndex;
        }

        int rightIndex = index * 2 + 2;

        if (rightIndex < array.length && array[rightIndex] > array[largerIndex]) {
            largerIndex = rightIndex;
        }

        if (index == largerIndex) {
            return;
        }

        swap(array, index, largerIndex);
        heapify(array, largerIndex);
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int getKthLargest(int[] array, int k) {
        if (k < 1 || k > array.length) {
            throw new IllegalArgumentException();
        }

        Heap heap = new Heap();
        for (int number : array) {
            heap.insert(number);
        }

        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }

        return heap.max();
    }
}
