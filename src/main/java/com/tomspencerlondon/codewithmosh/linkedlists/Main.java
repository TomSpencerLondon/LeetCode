package com.tomspencerlondon.codewithmosh.linkedlists;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size());

        list.addLast(10);
        System.out.println(list.size());

        list.addLast(20);
        list.addLast(20);
        System.out.println(list.size());
    }
}
