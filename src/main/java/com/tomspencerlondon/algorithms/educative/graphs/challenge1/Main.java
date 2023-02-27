package com.tomspencerlondon.algorithms.educative.graphs.challenge1;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("BFS traversal of Graph1 : " + bfs(g));
        System.out.println();

        Graph g2 = new Graph(5);
        g2.addEdge(0,1);
        g2.addEdge(0,4);
        g2.addEdge(1,2);
        g2.addEdge(3,4);
        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("BFS traversal of Graph2 : " + bfs(g2));
    }

    public static String bfs(Graph g) {
        String result = "";

        if (g.vertices < 1) {
            return result;
        }

        boolean[] visited = new boolean[g.vertices];

        for (int i = 0; i < g.vertices; i++) {
            if (!visited[i]) {
                result = result + bfsVisit(g, i, visited);
            }
        }

        return result;
    }

    private static String bfsVisit(Graph g, int source, boolean[] visited) {
        String result = "";

        Queue<Integer> queue = new Queue<Integer>(g.vertices);

        queue.enqueue(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.dequeue();

            result += String.valueOf(currentNode);

            DoublyLinkedList<Integer>.Node temp = null;

            if (g.adjacencyList[currentNode] != null) {
                temp = g.adjacencyList[currentNode].headNode;
            }

            while (temp != null) {
                if (!visited[temp.data]) {
                    queue.enqueue(temp.data);
                    visited[temp.data] = true;
                }

                temp = temp.nextNode;
            }

        }

        return result;

    }


}
