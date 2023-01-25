package com.tomspencerlondon.graphs.educative;

public class Main3 {

    public static void main(String[] args) {
        Graph graph = new Graph(17);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(2, 12);
        graph.addEdge(2, 14);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 8);
        graph.addEdge(4, 9);
        graph.printGraph();
        System.out.println(dfs(graph));
    }

    private static String dfs(Graph graph) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        Stack<Integer> stack = new Stack<Integer>(17);
        stack.push(start);
        boolean[] visited = new boolean[graph.vertices];
//        dfsAux(graph, stack, result);
        dfsRecursive(graph, 0, result, visited);

        return result.toString();
    }

    private static void dfsRecursive(Graph graph, int current, StringBuilder result, boolean[] visited) {
        result.append(current + " ");
        if (!visited[current]) {
            visited[current] = true;
            DoublyLinkedList<Integer>.Node tailNode = graph.adjacencyList[current].headNode;
            while (tailNode != null) {
                dfsRecursive(graph, tailNode.data, result, visited);
                tailNode = tailNode.nextNode;
            }
        }
    }

    private static void dfsAux(Graph graph, Stack<Integer> stack, StringBuilder result) {
        if (stack.isEmpty()) {
            return;
        }
            int current = stack.pop();
            result.append(current + " ");
            DoublyLinkedList<Integer>.Node tailNode = graph.adjacencyList[current].tailNode;
            while (tailNode != null) {
                stack.push(tailNode.data);
                tailNode = tailNode.prevNode;
            }

        dfsAux(graph, stack, result);
    }
}
