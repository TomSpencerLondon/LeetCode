package com.tomspencerlondon.graphs.educative;

public class Main2 {
    public static void main(String[] args) {
        Graph graph = new Graph(8);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);

        graph.printGraph();
        System.out.println(bfs(graph));
    }

    public static String bfs(Graph g) {
        String result = "";

        Queue<Integer> queue = new Queue<Integer>(10);

        queue.enqueue(0);
        result += 0;
        while (!queue.isEmpty()) {
            DoublyLinkedList<Integer>.Node headNode = g.adjacencyList[queue.dequeue()].headNode;
            while (headNode != null) {
                queue.enqueue(headNode.data);
                result += headNode.data;
                headNode = headNode.nextNode;
            }
        }
        return result;
    }
}
