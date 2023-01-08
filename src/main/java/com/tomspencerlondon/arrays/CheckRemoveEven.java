package com.tomspencerlondon.arrays;

public class CheckRemoveEven {
  // Given an array of size n,
// remove all even integers from it.

  public static int[] removeEven(int[] input) {
    int[] odds = new int[input.length];
    int index = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[i] % 2 != 0 && input[i] != 0) {
        odds[index++] = input[i];
      }
    }

    int[] result = new int[index];
    for (int i = 0; i < index; i++) {
      result[i] = odds[i];
    }
    return result;
  }
}
