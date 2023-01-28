package com.tomspencerlondon.codewithmosh.part2nonlinear.binarytrees.mosh.heaps;

public class Main {
    public static void main(String[] args) {
        //      20 (0)
        //  10 (1)   15 (2)
        // 4 (3)  5 (4)

        // left = parent * 2 + 1
        // right = parent * 2 + 2
        // parent = (index - 1) / 2

        // Heap
        // int[]
        // insert(int)
        // remove()

        Heap heap = new Heap();

        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);

        heap.remove();

        System.out.println("done");
    }
}
