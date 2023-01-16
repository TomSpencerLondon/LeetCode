package com.tomspencerlondon.codewithmosh.linkedlists;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        System.out.println(linkedList.contains(10));
        System.out.println(linkedList.indexOf(10));
        System.out.println(linkedList.size());
        Object[] array = linkedList.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(linkedList);
    }
}
