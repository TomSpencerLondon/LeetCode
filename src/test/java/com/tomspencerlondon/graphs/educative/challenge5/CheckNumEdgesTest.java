package com.tomspencerlondon.graphs.educative.challenge5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckNumEdgesTest {

    @Test
    void returns11EdgesForGraphWith11Edges() {
        Graph g = new Graph(9);
        g.addEdge(0,2);
        g.addEdge(0,5);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(5,3);
        g.addEdge(5,6);
        g.addEdge(3,6);
        g.addEdge(6,7);
        g.addEdge(6,8);
        g.addEdge(6,4);
        g.addEdge(7,8);

        assertThat(CheckNumEdges.numEdges(g))
                .isEqualTo(11);
    }

    @Test
    void numEdgesForDirectedGraph() {
        Graph g = new Graph(7);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(2,5);
        g.addEdge(2,4);
        g.addEdge(4,6);
        g.addEdge(4,5);
        g.addEdge(6,5);

        assertThat(CheckNumEdges.numEdges(g))
                .isEqualTo(9);
    }
}