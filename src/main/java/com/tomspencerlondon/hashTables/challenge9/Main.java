package com.tomspencerlondon.hashTables.challenge9;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        for (int i = 7; i > 3; i--) {
            list1.insertAtHead(i);
        }
        System.out.println("1st ");
        list1.printList();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        for (int i = 0; i < 5; i++) {
            list2.insertAtHead(i);
        }

        System.out.println("2nd ");
        list2.printList();

        System.out.println("After Union ");
        unionWithHashing(list1, list2).printList();

        System.out.println("After Intersection ");
        intersectionWithHashing(list1, list2).printList();
    }

    // Set which contains all elements present in A or B
    // list1 = 15->22->8->null
    // list2 = 7->14->22->null
    // Union = 15->22->8->7->14->null
    private static <T> SinglyLinkedList<T> unionWithHashing(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<>();
        Set<T> visited = new HashSet<>();

        SinglyLinkedList<T>.Node current = list1.getHeadNode();

        while (current != null) {
            if (!visited.contains(current.data)) {
                result.insertAtHead(current.data);
                visited.add(current.data);
            }

            current = current.nextNode;
        }

        current = list2.getHeadNode();

        while (current != null) {
            if (!visited.contains(current.data)) {
                result.insertAtHead(current.data);
                visited.add(current.data);
            }

            current = current.nextNode;
        }

        return result;
    }

    // Set which contains all the common elements present in A and B
    // list1 = 15->22->8->null
    // list2 = 7->14->22->null
    // Intersection = 22->null
    private static <T> SinglyLinkedList<T> intersectionWithHashing(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<>();

        Set<T> visited = new HashSet<>();

        SinglyLinkedList<T>.Node current = list1.getHeadNode();

        while (current != null) {
            if (!visited.contains(current.data)) {
                visited.add(current.data);
            }
            current = current.nextNode;
        }

        current = list2.getHeadNode();

        while (current != null) {
            if (visited.contains(current.data)) {
                result.insertAtHead(current.data);
                visited.remove(current.data);
            }
            current = current.nextNode;
        }

        return result;
    }
}
