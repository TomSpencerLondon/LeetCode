package com.tomspencerlondon.graphs.educative.challenge4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckMotherVertexTest {

    @Test
    void fiveIsMotherVertex() {
        Graph g1 = new Graph(7);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 3);
        g1.addEdge(4, 1);
        g1.addEdge(6, 4);
        g1.addEdge(5, 6);
        g1.addEdge(5, 2);
        g1.addEdge(6, 0);
        assertEquals(5, CheckMotherVertex.findMotherVertex(g1));
    }

    @Test
    void noMotherVertexReturnsMinusOne() {

        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(2, 3);
        assertEquals(-1, CheckMotherVertex.findMotherVertex(g2));
    }

    @Test
    void motherVertex() {
        Graph g4 = new Graph(5);
        g4.addEdge(0, 1);
        g4.addEdge(0, 2);
        g4.addEdge(1, 3);
        g4.addEdge(3, 4);
        assertEquals(0, CheckMotherVertex.findMotherVertex(g4));
    }
}