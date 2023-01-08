package com.tomspencerlondon.arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import net.bytebuddy.build.HashCodeAndEqualsPlugin.Sorted;
import org.junit.jupiter.api.Test;

class MergeTwoSortedArraysTest {
//  Challenge 2: Merge Two Sorted Arrays
//  Given two sorted arrays, merge them into
//  one array, which should also be sorted.
@Test
public void mergeTwoArraysOfSameLength() {
  int[] input1 = {1, 3, 5};
  int[] input2 = {2, 4, 6};
  int[] expected = {1, 2, 3, 4, 5, 6};
  int[] output = MergeTwoSortedArrays.mergeArrays(input1, input2);
  System.out.println("output: " + Arrays.toString(output));
  assertArrayEquals(expected, output);
}

  @Test
  void mergeTwoArraysOfDifferentLengths() {
    int[] input2a = {1, 3, 5, 7, 9};
    int[] input2b = {2, 4, 6};
    int[] expectedOutput2 = {1, 2, 3, 4, 5, 6, 7, 9};
    int[] output2 = MergeTwoSortedArrays.mergeArrays(input2a, input2b);
    assertArrayEquals(expectedOutput2, output2);
  }

  @Test
  void mergeTwoArraysWithDuplicates() {
    int[] input3a = {1, 2, 3, 3, 3, 5};
    int[] input3b = {2, 2, 3, 4, 4, 6};
    int[] expectedOutput3 = {1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6};
    int[] output3 = MergeTwoSortedArrays.mergeArrays(input3a, input3b);
    assertArrayEquals(expectedOutput3, output3);
  }

  @Test
  void mergeTwoEmptyArrays() {
    int[] input4a = {};
    int[] input4b = {};
    int[] expectedOutput4 = {};
    int[] output4 = MergeTwoSortedArrays.mergeArrays(input4a, input4b);
    assertArrayEquals(expectedOutput4, output4);
  }
}