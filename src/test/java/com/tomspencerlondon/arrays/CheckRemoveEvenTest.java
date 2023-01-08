package com.tomspencerlondon.arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CheckRemoveEvenTest {

    @Test
    void removeEvenReturnsAllOddNumbers() {
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] expected = {1, 3, 5, 7, 9};
      int[] actual = CheckRemoveEven.removeEven(input);
      System.out.println(Arrays.toString(actual));
      assertArrayEquals(expected, actual);
    }

    @Test
    void removeEvenReturnsAllOddNumbersWhenAllNumbersAreOdd() {
      int[] input = {1, 3, 5, 7, 9};
      int[] expected = {1, 3, 5, 7, 9};
      assertArrayEquals(expected, CheckRemoveEven.removeEven(input));
    }

    @Test
    void removeEvenReturnsAllOddNumbersWhenAllNumbersAreEven() {
      int[] input = {2, 4, 6, 8, 10};
      int[] expected = {};
      assertArrayEquals(expected, CheckRemoveEven.removeEven(input));
    }

    @Test
    void removeEvenReturnsAllOddNumbersWhenAllNumbersAreZero() {
      int[] input = {0, 0, 0, 0, 0};
      int[] expected = {};
      assertArrayEquals(expected, CheckRemoveEven.removeEven(input));
    }

    @Test
    void removeEvenReturnsAllOddNumbersWhenAllNumbersAreNegative() {
      int[] input = {-1, -3, -5, -7, -9};
      int[] expected = {-1, -3, -5, -7, -9};
      assertArrayEquals(expected, CheckRemoveEven.removeEven(input));
    }

    @Test
    void removeEvenReturnsAllOddNumbersWhenAllNumbersArePositive() {
      int[] input = {1, 3, 5, 7, 9};
      int[] expected = {1, 3, 5, 7, 9};
      assertArrayEquals(expected, CheckRemoveEven.removeEven(input));
    }

    @Test
    void removeEvenReturnsAllOddNumbersWhenAllNumbersAreMixed() {
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] expected = {1, 3, 5, 7, 9};
      assertArrayEquals(expected, CheckRemoveEven.removeEven(input));
    }
}