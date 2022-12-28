package com.tomspencerlondon.mergesort;

import java.util.Arrays;

public class MergeSort2 {

  public static void main(String[] args) {
    int[] arr = {9, 5, 2, 4, 3};

    sort(arr, new int[arr.length], 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

  private static void sort(int[] arr, int[] temp, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      sort(arr, temp, low, mid);
      sort(arr, temp, mid + 1, high);
      merge(arr, temp, low, mid, high);
    }
  }

  private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    int i = low;
    int j = mid + 1;
    int k = low;

    while (i <= mid && j <= high) {
      if (temp[i] <= temp[j]) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = temp[j];
        j++;
      }
      k++;
    }

    while (i <= mid) {
      arr[k] = temp[i];
      i++;
      k++;
    }
  }
}
