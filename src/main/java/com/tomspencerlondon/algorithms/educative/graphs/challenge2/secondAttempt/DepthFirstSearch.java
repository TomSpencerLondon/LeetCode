package com.tomspencerlondon.algorithms.educative.graphs.challenge2.secondAttempt;

import java.util.Collections;
import java.util.LinkedList;

public class DepthFirstSearch<T> {

    public void traverse(Vertex<T> startVertex) {
        LinkedList<Vertex<T>> stack = new LinkedList<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            Vertex<T> current = stack.pop();
            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                Collections.reverse(current.getNeighbors());
                current.getNeighbors().forEach(stack::push);
            }
        }
    }
}