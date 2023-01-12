package com.tomspencerlondon.linkedlist.challenge2;

public class Challenge2 {
//    Challenge 2: Search in Singly Linked List
//This lesson explains how searching is done in a Singly Linked List.
// Also, there is a coding exercise in the end to test your concepts.

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertAtHead(125);
        list.insertAtHead(2321);
        list.insertAtHead(55);
        list.insertAtHead(4);
        list.insertAtHead(55);
        list.insertAtHead(125);

        list.printList();
        System.out.println(search(list, 55));
    }

    private static boolean search(SinglyLinkedList<Integer> list, int data) {
        Node current = list.headNode;

        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.nextNode;
        }

        return false;
    }
}
