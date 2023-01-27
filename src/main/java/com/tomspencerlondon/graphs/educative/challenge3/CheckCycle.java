package com.tomspencerlondon.graphs.educative.challenge3;

class CheckCycle {
    public static boolean detectCycle(Graph g){
        System.out.println("\nStarted graph: ");
        // Write -- Your -- Code

        for (int i = 0; i < g.vertices; i++) {
            if (dfs(g, i)) {
                return true;
            }
            System.out.println("\n---");
        }
        return false;
    }

    public static boolean dfs(Graph g, int index) {
        boolean[] visited = new boolean[g.vertices];

        Stack<Integer> stack = new Stack<>(g.vertices);
        stack.push(index);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (visited[current]) {
                return true;
            }

            System.out.print(current + " ");
            DoublyLinkedList.Node headNode = g.adjacencyList[current].headNode;

            visited[current] = headNode != null;

            while (headNode != null) {
                stack.push((int) headNode.data);
                headNode = headNode.nextNode;
            }
        }

        return false;
    }

}
