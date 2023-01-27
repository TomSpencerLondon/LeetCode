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
}