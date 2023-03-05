package com.tomspencerlondon.algorithms.educative.greedy.problem2.sorting.heapSort;

public class MinHeap {
    int[] heapArr;
    int hSize;
    int capacity;

    public MinHeap(int[] pipes, int size) {
        hSize = size;
        capacity = size;
        heapArr = pipes;
        int i = (hSize - 1) / 2;
        while (i >= 0) {
            minHeapify(i);
            i--;
        }
    }

    private void minHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if (l < hSize && heapArr[l] < heapArr[i]) {
            smallest = l;
        }
        if (r < hSize && heapArr[r] < heapArr[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int extractMin() {
        if (hSize <= 0) {
            return Integer.MIN_VALUE;
        }

        if (hSize == 1) {
            hSize--;
            return heapArr[0];
        }

        int root = heapArr[0];
        heapArr[0] = heapArr[hSize - 1];
        hSize--;
        minHeapify(0);

        return root;
    }

    void insertKey(int x) {
        if (hSize == capacity) {
            return;
        }

        hSize++;
        int i = hSize - 1;
        heapArr[i] = x;

        while (i != 0 && heapArr[parent(i)] > heapArr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    boolean sizeIsOne() {
        return hSize == 1;
    }

    void swap(int x, int y) {
        int temp = heapArr[x];
        heapArr[x] = heapArr[y];
        heapArr[y] = temp;
    }
}
