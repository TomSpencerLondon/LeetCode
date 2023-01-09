package com.tomspencerlondon.arrays.jump;

public class JumpRecursiveSolution {
  public static void main(String[] args) {
    int[] numbers = new int[]{2, 3, 1, 1, 4};

    System.out.println(jumpRecursive(numbers, 0));
  }

  public static int jumpRecursive(int[] numbers, int index) {
    if (index >= numbers.length - 1) {
      return 0;
    }

    int min = Integer.MAX_VALUE;

    for (int i = index + 1; i <= index + numbers[index]; i++) {
      min = Math.min(min, jumpRecursive(numbers, i) + 1);
    }

    return min;
  }

}
