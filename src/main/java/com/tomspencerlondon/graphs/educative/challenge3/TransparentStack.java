package com.tomspencerlondon.graphs.educative.challenge3;

import java.util.Arrays;
import java.util.stream.Stream;

public class TransparentStack<V> extends Stack<V> {
    public TransparentStack(int maxSize) {
        super(maxSize);
    }

    public boolean contains(V current) {
        Stream<V> stream = Arrays.stream(array);
        return stream.anyMatch(current::equals);
    }
}
