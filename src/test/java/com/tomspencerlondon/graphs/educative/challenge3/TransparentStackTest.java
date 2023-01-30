package com.tomspencerlondon.graphs.educative.challenge3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransparentStackTest {

    @Test
    void findsElementInStack() {
        TransparentStack<Integer> stack = new TransparentStack<>(2);
        stack.push(1);

        assertTrue(stack.contains(1));
        assertFalse(stack.contains(3));
    }

    @Test
    void doesntFindInStackIfStackIsEmpty() {
        TransparentStack<Integer> stack = new TransparentStack<>(2);

        assertFalse(stack.contains(1));
    }

    @Test
    void doesntFindInStackIfNumberPopped() {
        TransparentStack<Integer> stack = new TransparentStack<>(2);
        stack.push(1);
        stack.pop();
        assertFalse(stack.contains(1));
    }

    @Test
    void findsElementInStackIfTwoInStack() {
        TransparentStack<Integer> stack = new TransparentStack<>(2);
        stack.push(1);
        stack.push(2);

        assertTrue(stack.contains(1));
    }

    @Test
    void findsElementInStackIfThreeInStack() {
        TransparentStack<Integer> stack = new TransparentStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertTrue(stack.contains(1));
    }
}