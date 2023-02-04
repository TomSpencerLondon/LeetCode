package com.tomspencerlondon.graphs.educative.challenge9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RemoveEdgeTest {


    @Test
    void removesEdgeWithOneDestinationAndTwoChildren() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        int source = 1;
        RemoveEdge.removeEdge(graph, source, 2);
        DoublyLinkedList<Integer>.Node headNode = graph.adjacencyList[source].headNode;
        assertNull(headNode);
    }

    @Test
    void removesEdgeWithOneChild() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);

        int source = 0;
        RemoveEdge.removeEdge(graph, source, 1);
        DoublyLinkedList<Integer>.Node nextNode = graph.adjacencyList[source].headNode;
        assertNull(nextNode);
    }

    @Test
    void removesEdgeWithOneChildInGraphWithTwoComponents() {
        Graph graph = new Graph(4);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        int source = 1;
        RemoveEdge.removeEdge(graph, source, 3);
        DoublyLinkedList<Integer>.Node nextNode = graph.adjacencyList[source].headNode;
        assertNull(nextNode);
    }
}