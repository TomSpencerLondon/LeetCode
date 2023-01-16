package com.tomspencerlondon.codewithmosh.linkedlists;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.deleteFirst();
        linkedList.addFirst(10);
        linkedList.deleteLast();
        linkedList.print();

        System.out.println(linkedList.indexOf(10));
        System.out.println(linkedList.contains(10));
    }
}
