package com.tomspencerlondon.arrays.jump;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import com.tomspencerlondon.arrays.CheckRemoveEven;
import org.junit.jupiter.api.Test;

class JumpRecursiveSolutionTest {

  @Test
  void returnZeroIfInputArrayIsEmpty() {
    int[] input = {};
    int index = 0;
    int expected = 0;
    int actual = JumpRecursiveSolution.jumpRecursive(input, index);
    assertEquals(expected, actual);
  }

  @Test
  void returnFourIfAllOnes() {
    int[] input = {1, 1, 1, 1, 1};
    int index = 0;
    int expected = 4;
    int output = JumpRecursiveSolution.jumpRecursive(input, index);
    assertEquals(expected, output);
  }

  @Test
  void returnTwoWhenTwoIsMinimum() {
    int[] input = {2, 3, 1, 1, 4};
    int index = 0;
    int expected = 2;
    int output = JumpRecursiveSolution.jumpRecursive(input, index);
    assertEquals(expected, output);
  }
}