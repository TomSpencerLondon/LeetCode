package com.tomspencerlondon.arrays;

public class MergeTwoSortedArrays {
  public static int[] mergeArrays(int[] arr1, int[] arr2) {
    int left = 0;
    int right = 0;

    int[] result = new int[arr1.length + arr2.length];
    int index = 0;
    while (left < arr1.length && right < arr2.length) {
      if (arr1[left] <= arr2[right]) {
        result[index++] = arr1[left];
        left++;
      } else {
        result[index++] = arr2[right];
        right++;
      }
    }
    while (left < arr1.length) {
      result[index++] = arr1[left++];
    }

    while (right < arr2.length) {
      result[index++] = arr2[right++];
    }

    return result;
  }
}
