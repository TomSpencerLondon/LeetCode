package com.tomspencerlondon.graphs.educative.challenge3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckCycle2Test {
    @Test
    void detectsNoCycleInEmptyGraph() {
        Graph graph = new Graph(0);

        boolean result = CheckCycle2.detectCycle(graph);

        assertFalse(result);
    }

    @Test
    void detectsNoCycleInGraphWithOneVertexAndNoEdges() {
        Graph graph = new Graph(1);

        boolean result = CheckCycle2.detectCycle(graph);

        assertFalse(result);
    }

    @Test
    void detectsCycleWithSingleVertexLoop() {
        Graph graph = new Graph(1);

        graph.addEdge(0, 0);

        boolean result = CheckCycle2.detectCycle(graph);

        assertTrue(result);
    }

    // Graph 1
//>>Adjacency List of Directed Graph<<
//|0| => [1] -> null
//|1| => [2] -> null
//|2| => [3] -> null
//|3| => [1] -> null
//|4| => [2] -> null

    @Test
    void detectsLoopBetweenSecondAndFourthEdges() {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(4, 2);

        boolean result = CheckCycle2.detectCycle(graph);

        assertTrue(result);
    }


    //Graph 2
//>>Adjacency List of Directed Graph<<
//|0| => [1] -> null
//|1| => [2] -> null
//|2| => [3] -> null
//|3| => null

    @Test
    void detectsNoLoopWhenNoneAvailable() {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        boolean result = CheckCycle2.detectCycle(graph);

        assertFalse(result);
    }
//Graph 3
//>>Adjacency List of Directed Graph<<
//|0| => [1] -> null
//|1| => [2] -> [3] -> null
//|2| => [3] -> null
//|3| => null

    @Test
    void detectsNoLoopOnTreeWithTwoNodesPointingToNodeThree() {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        boolean result = CheckCycle2.detectCycle(graph);

        assertFalse(result);
    }
//Graph 4
//>>Adjacency List of Directed Graph<<
//|0| => [1] -> null
//|1| => null
//|2| => [3] -> null
//|3| => [4] -> null
//|4| => [2] -> null

    @Test
    void detectsNoLoopOnTreeWithNodeFourConnectingToTwo() {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);

        boolean result = CheckCycle2.detectCycle(graph);

        assertTrue(result);
    }

    @Test
    void detectsLoopWhenOnePointsToItself() {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 1);

        boolean result = CheckCycle2.detectCycle(graph);

        assertTrue(result);
    }

    @Test
    void noLoopWithIsolatedNode() {
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);

        boolean result = CheckCycle2.detectCycle(graph);

        assertFalse(result);
    }

    @Test
    void loopWithBackTracking() {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(2, 5);
        g.addEdge(5, 2);
        g.addEdge(5, 6);

        assertTrue(CheckCycle2.detectCycle(g));
    }

    @Test
    void singleCycleWithAnotherJunction() {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);


        assertFalse(CheckCycle2.detectCycle(g));
    }
}