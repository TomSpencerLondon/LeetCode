package com.tomspencerlondon.arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoNumbersAddingToNTest {
//  Challenge 3: Find Two Numbers that Add up to "n"
//  Given an array and a number "n", find two numbers
//  from the array that sums up to "n". Implement your solution in Java
//  and see if your output matches with the correct output.

  @Test
  void givenSeveralAddingToNReturnFirstTwoNumbersAddingToN() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int n = 10;
    int[] result = TwoNumbersAddingToN.twoNumbersAddingToN(array, n);
    assertThat(result).containsExactly(1, 9);
  }

  @Test
  void firstNumbersAddingToN() {
    int[] input = {1, 3, 5, 7, 9};
    int n = 8;
    int[] expected = {1, 7};
    int[] output = TwoNumbersAddingToN.twoNumbersAddingToN(input, n);
    assertArrayEquals(expected, output);
  }

  @Test
  public void emptyArrayIfNoTwoNumbersAddToN() {
    int[] input = {1, 4, 5, 7, 9};
    int n = 4;
    int[] expectedOutput2 = {};
    int[] actual = TwoNumbersAddingToN.twoNumbersAddingToN(input, n);
    assertArrayEquals(expectedOutput2, actual);
  }

  @Test
  void emptyArrayIfArrayIsEmptyAreEmpty() {
    int[] input = {};
    int n = 4;
    int[] expected = {};
    int[] actual = TwoNumbersAddingToN.twoNumbersAddingToN(input, n);
    assertArrayEquals(expected, actual);
  }

  @Test
  void returnTwoNumbersAddingUpToNIfMaximumAndMinimumValuesInArray() {
    int[] input = {0, 1, 3, 5, 7, 9, Integer.MAX_VALUE};
    int n = Integer.MAX_VALUE;
    int[] expected = {Integer.MAX_VALUE, 0};
    int[] output = TwoNumbersAddingToN.twoNumbersAddingToN(input, n);
    assertArrayEquals(expected, output);
  }
}