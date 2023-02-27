package com.tomspencerlondon.algorithms.educative.graphs.challenge1.secondAttempt;

import java.util.LinkedList;

public class BreadthFirstSearch <T> {
    private final Vertex<T> startVertex;


    public BreadthFirstSearch(Vertex<T> startVertex) {
        this.startVertex = startVertex;
    }

    public void traverse() {
        LinkedList<Vertex<T>> queue = new LinkedList<>();

        queue.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();

            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbors());
            }
        }
    }
}
