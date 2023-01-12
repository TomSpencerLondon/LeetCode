package com.tomspencerlondon.linkedlist.challenge1;

public class Challenge1 {
//    Challenge 1: Insertion in a Singly Linked List (insert at End)
//Now, we'll tackle the second insertion strategy of insertion in linked lists.
//In this strategy, we'll insert a new node at the end of the linked list.

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertAtHead(125);
        list.insertAtHead(2321);
        list.insertAtHead(55);
        list.insertAtHead(4);
        list.insertAtHead(55);
        list.insertAtHead(125);

        list.printList();
        insertAtEnd(list, 1000);
        list.printList();
    }

    private static void insertAtEnd(SinglyLinkedList<Integer> list, int data) {
        Node current = list.headNode;

        Node<Integer> newNode = new Node<>();
        newNode.data = data;

        while (current.nextNode != null) {
            current = current.nextNode;
        }

        current.nextNode = newNode;
    }
}
