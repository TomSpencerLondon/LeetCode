package com.tomspencerlondon.arrays;

public class TwoNumbersAddingToN {

  public static int[] twoNumbersAddingToN(int[] array, int n) {
    if (array.length == 0) {
      return new int[0];
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      max = Math.max(max, array[i]);
    }

    if (max >= Integer.MAX_VALUE) {
      return new int[] {Integer.MAX_VALUE, 0};
    }

    int[] store = new int[max + 1];

    for (int i = 0; i < array.length; i++) {
      store[array[i]] = array[i];
    }

    for (int i = 0; i < array.length; i++) {
      int temp = n - array[i];
      if (temp >= 0 && store[temp] != 0) {
        return new int[] {array[i], temp};
      }
    }

    return new int[0];
  }
}
