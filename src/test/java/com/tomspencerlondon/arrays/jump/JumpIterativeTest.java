package com.tomspencerlondon.arrays.jump;

import static com.tomspencerlondon.arrays.jump.JumpIterative.jumpIterative;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import com.tomspencerlondon.arrays.CheckRemoveEven;
import org.junit.jupiter.api.Test;

class JumpIterativeTest {


  @Test
  void returnZeroIfInputArrayIsEmpty() {
    int[] input2 = {};
    int expectedOutput2 = 0;
    int output2 = jumpIterative(input2);
    assertEquals(expectedOutput2, output2);
  }

  @Test
  void returnMinimumNumberOfJumps() {
    int[] input = {2, 3, 1, 1, 4};
    int expected = 2;
    int output = jumpIterative(input);
    assertEquals(expected, output);
  }

  @Test
  public void testJumpIterative() {
    int[] input = {5, 5, 5, 5, 5};
    int expected = 1;
    int output = jumpIterative(input);
    assertEquals(expected, output);
  }

  @Test
  void minimumWhenNumberIsAlwaysOne() {
    int[] input = {1, 1, 1, 1, 1};
    int expected = 4;
    int output = jumpIterative(input);
    assertEquals(expected, output);
  }

  @Test
  public void testSingleElementArray() {
    int[] nums = {5};
    int expected = 0;
    int actual = jumpIterative(nums);
    assertEquals(expected, actual);
  }

  @Test
  public void testTwoElementArrayReachable() {
    int[] nums = {1, 2};
    int expected = 1;
    int actual = jumpIterative(nums);
    assertEquals(expected, actual);
  }

  @Test
  public void testLastElementReachable() {
    int[] nums = {1, 2, 3, 4, 5};
    int expected = 3;
    int actual = jumpIterative(nums);
    assertEquals(expected, actual);
  }

  @Test
  public void testLastElementNotReachable() {
    int[] nums = {1, 1, 0, 1, 2};
    int expected = -1;
    int actual = jumpIterative(nums);
    assertEquals(expected, actual);
  }

  @Test
  public void testMultiplePathsToLastElement() {
    int[] nums = {1, 2, 3, 2, 5};
    int expected = 3;
    int actual = jumpIterative(nums);
    assertEquals(expected, actual);
  }
}