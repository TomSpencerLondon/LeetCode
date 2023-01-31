package com.tomspencerlondon.graphs.educative.challenge6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPathsTest {

    @Test
    void findsPathWhenPresent() {
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

        assertTrue(CheckPaths.checkPath(g, 0, 7));
    }

    @Test
    void returnsFalseWhenNoPathPresentInDirectedGraph() {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);

        assertFalse(CheckPaths.checkPath(g, 3, 0));
    }
}