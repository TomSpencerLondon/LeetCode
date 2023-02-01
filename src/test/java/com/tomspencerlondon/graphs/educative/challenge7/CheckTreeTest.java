package com.tomspencerlondon.graphs.educative.challenge7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTreeTest {

    @Test
    void returnsTrueIfTree() {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(3,4);
        g.printGraph();
        assertTrue(CheckTree.isTree(g));
    }

    @Test
    void returnsFalseIfCycle() {

        Graph g2 = new Graph(4);
        g2.addEdge(0,1);
        g2.addEdge(0,2);
        g2.addEdge(0,3);
        g2.addEdge(3,2);
        g2.printGraph();
        assertFalse(CheckTree.isTree(g2));
    }

    @Test
    void returnsFalseIfUnconnected() {
        Graph g3 = new Graph(6);
        g3.addEdge(0,1);
        g3.addEdge(0,2);
        g3.addEdge(0,3);
        g3.addEdge(4,5);
        g3.printGraph();
        assertFalse(CheckTree.isTree(g3));
    }
}