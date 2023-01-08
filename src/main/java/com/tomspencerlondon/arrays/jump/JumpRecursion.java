package com.tomspencerlondon.arrays.jump;

public class JumpRecursion {

  public static void main(String[] args) {
    int[] numbers = new int[]{2, 3, 1, 1, 4};

    jump(numbers, 0);
  }

  private static void jump(int[] numbers, int index) {
    if (index >= numbers.length - 1) {
      System.out.println("I reached my destination: " + index);
      return;
    }

    for (int i = index + 1; i <= index + numbers[index]; i++) {
      System.out.println("- I am at index: " + index);
      System.out.println("At number: " + numbers[index]);
      jump(numbers, i);
    }
  }
}
