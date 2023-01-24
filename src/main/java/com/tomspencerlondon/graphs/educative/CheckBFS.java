package com.tomspencerlondon.graphs.educative;

class CheckBFS {

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

    //Breadth First Traversal of Graph g
    public static String bfs(Graph g) {
        String result = "";

        Queue<Integer> queue = new Queue(g.adjacencyList.length);
        boolean[] visited = new boolean[g.vertices];

        for (int i = 0; i < g.vertices; i++) {
            queue.enqueue(i);

            while (!queue.isEmpty()) {
                int current = queue.dequeue();
                if (!visited[current]) {
                    visited[current] = true;
                    result += current;
                    DoublyLinkedList.Node headNode = g.adjacencyList[current].headNode;

                    while (headNode != null) {
                        queue.enqueue((int) headNode.data);
                        headNode = headNode.nextNode;
                    }
                }

            }
        }


        // Write - Your - Code
        g.printGraph();
        return result;
    }

}
