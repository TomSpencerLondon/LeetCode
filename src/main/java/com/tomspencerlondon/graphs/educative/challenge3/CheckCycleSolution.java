package com.tomspencerlondon.graphs.educative.challenge3;

class CheckCycleSolution {
    public static boolean detectCycle(Graph g){
        int num_of_vertices = g.vertices;

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean [num_of_vertices];
        //Holds a flag if the node is currently in Stack or not (by default- false)
        boolean[] stackFlag = new boolean[num_of_vertices];

        for (int i = 0; i < num_of_vertices; i++){
            //Check cyclic on each node
            if (cyclic(g, i, visited, stackFlag)){
                return true;
            }
        }
        return false;
    }
    public static boolean cyclic(Graph g, int v, boolean[] visited, boolean[] stackFlag){
        //if node is currently in stack that means we have found a cycle
        if (stackFlag[v])
            return true;

        //if it is already visited (and not in Stack) then there is no cycle
        if (visited[v])
            return false;

        visited[v] = true;
        stackFlag[v] = true;

        // check adjacency list of the node
        DoublyLinkedList<Integer>.Node temp = null;
        if (g.adjacencyList[v] != null)
            temp = g.adjacencyList[v].headNode;

        while (temp != null) {
            //run cyclic function recursively on each outgowing path
            if(cyclic(g, temp.data, visited, stackFlag)){
                return true;
            }
            temp = temp.nextNode;
        }
        stackFlag[v] = false;

        return false;
    }

}