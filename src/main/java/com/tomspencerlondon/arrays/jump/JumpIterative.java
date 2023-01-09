package com.tomspencerlondon.arrays.jump;

public class JumpIterative {

  public static void main(String[] args) {
    int[] numbers = new int[]{2, 3, 1, 1, 4};

//    System.out.println(jumpIterative(numbers));

    System.out.println(Integer.MAX_VALUE + 1);
  }

  public static int jumpIterative(int[] numbers) {
    if (numbers.length == 0) {
      return 0;
    }

    int[] jumps = new int[numbers.length];

    for (int i = 1; i < numbers.length; i++) {
      jumps[i] = Integer.MAX_VALUE;
    }

    jumps[0] = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < i; j++) {
        if (numbers[j] == 0) {
          return -1;
        }

        if (j + numbers[j] >= i) {
          jumps[i] = Math.min(jumps[i], jumps[j] + 1);
        }
      }
    }

    if (jumps[numbers.length - 1] == Integer.MAX_VALUE) {
      return -1;
    }

    return jumps[jumps.length - 1];
  }
}
