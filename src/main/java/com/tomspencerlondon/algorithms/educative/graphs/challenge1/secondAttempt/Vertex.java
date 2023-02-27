package com.tomspencerlondon.algorithms.educative.graphs.challenge1.secondAttempt;

import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class Vertex<T> {
    private final T data;
    private boolean visited;
    @ToString.Exclude
    private List<Vertex<T>> neighbors = new LinkedList<>();
}
