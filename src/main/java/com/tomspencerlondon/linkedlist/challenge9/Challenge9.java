package com.tomspencerlondon.linkedlist.challenge9;

import java.util.HashSet;
import java.util.Set;

public class Challenge9 {

    public static void main(String[] args) {
        // Challenge 9: Union & Intersection of Lists
        //Given two lists, find the Union & Intersection of their elements.
        SinglyLinkedList<Integer> listA = new SinglyLinkedList<>();
        listA.insertAtHead(2);
        listA.insertAtHead(10);
        listA.insertAtHead(7);
        listA.insertAtHead(10);

        SinglyLinkedList<Integer> listB = new SinglyLinkedList<>();
        listB.insertAtHead(2);
        listB.insertAtHead(10);
        listB.insertAtHead(7);
        listB.insertAtHead(10);


        listA.printList();
        listB.printList();
        SinglyLinkedList<Integer> union = union(listA, listB);
        union.printList();
    }

    public static SinglyLinkedList<Integer> union(SinglyLinkedList<Integer> listA, SinglyLinkedList<Integer> listB) {
        SinglyLinkedList<Integer> result = new SinglyLinkedList<>();

        Node listNodeA = listA.headNode;
        Node listNodeB = listB.headNode;

        while (listNodeA != null) {
            result.insertAtHead((Integer) listNodeA.data);

            listNodeA = listNodeA.nextNode;
        }

        while (listNodeB != null) {
            result.insertAtHead((Integer) listNodeB.data);

            listNodeB = listNodeB.nextNode;
        }
        removeDuplicatesFromUnion(result);
        return result;
    }

    public static void removeDuplicatesFromUnion(SinglyLinkedList<Integer> list) {
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
