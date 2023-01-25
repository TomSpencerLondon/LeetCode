package com.tomspencerlondon.codewithmosh.part1linear.linkedlists;

public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        System.out.println(list.size());
//
//        list.addLast(10);
//        System.out.println(list.size());
//
//        list.addLast(20);
//        list.addLast(20);
//        System.out.println(list.size());
//        int[] array = list.toArray();
//
//        System.out.println(Arrays.toString(array));

        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
//        list.print();

//        list.reverseUptoIndex(2);
//        list.reverse();
//        System.out.println(list.kthNodeFromEnd(1));
        System.out.println(list.printMiddle());
        LinkedList objectLinkedList = new LinkedList<>();
        LinkedList loopList = objectLinkedList.createWithLoop();

        System.out.println(loopList.hasLoop());
//        list.print();
    }
}
