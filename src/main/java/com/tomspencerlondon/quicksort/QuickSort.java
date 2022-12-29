package com.tomspencerlondon.quicksort;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {5, 2, 0, 1, 6, 3};

    quickSort(arr, 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int p = partition(arr, low, high);
      quickSort(arr, low, p - 1);
      quickSort(arr, p + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;
    int j = low;

    while (i <= high) {
      if (arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
      i++;
    }

    return j - 1;
  }
}
