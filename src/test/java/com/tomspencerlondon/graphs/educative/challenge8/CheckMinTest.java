package com.tomspencerlondon.graphs.educative.challenge8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckMinTest {

    @Test
    void graphWithTwoPossiblePathsShowsLengthForShortest() {
        Graph graph = new Graph(6);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);

        assertThat(CheckMin.findShortestPathLength(graph, 1, 5))
                .isEqualTo(2);
    }

    @Test
    void graphWithDirectConnectionShowsLengthOfOne() {
        Graph graph = new Graph(3);

        graph.addEdge(0, 2);
        graph.addEdge(0, 1);

        assertThat(CheckMin.findShortestPathLength(graph, 0, 2))
                .isEqualTo(1);
    }
}