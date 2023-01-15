package com.tomspencerlondon.linkedlist.challenge8;

import java.util.HashSet;
import java.util.Set;

public class Challenge8HashSet {
    public static void main(String[] args) {
        // Remove duplicates from a linked list
//      Given a linked list remove duplicates from it

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtHead(2);
        list.insertAtHead(10);
        list.insertAtHead(7);
        list.insertAtHead(10);


        list.printList();
        removeDuplicatesWithHashSet(list);
        list.printList();
    }

    private static void removeDuplicatesWithHashSet(SinglyLinkedList<Integer> list) {
        Set<Integer> set = new HashSet<>();
        Node current = list.headNode;
        Node prev = null;

        while (current != null) {
            if (set.contains(current.data)) {
                prev.nextNode = current.nextNode;
            } else {
                set.add((Integer) current.data);
                prev = current;
            }

            current = current.nextNode;
        }
    }
}
