package com.tomspencerlondon.graphs.educative.challenge3;

import java.util.Arrays;
import java.util.stream.Stream;

public class TransparentStack<V> extends Stack<V> {
    public TransparentStack(int maxSize) {
        super(maxSize);
    }

    public boolean contains(V current) {
        Stream<V> stream = Arrays.stream(
                Arrays.copyOfRange(array, 0, top == -1 ? 0 : top + 1));
        return stream.anyMatch(current::equals);
    }
}
