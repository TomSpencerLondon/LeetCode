package com.tomspencerlondon.linkedlist.practice.reverseLinkedList;

public class Main {
    private static SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

    public static void main(String[] args) {

        list.insertAtHead(125);
        list.insertAtHead(2321);
        list.insertAtHead(55);
        list.insertAtHead(4);
        list.insertAtHead(55);
        list.insertAtHead(125);

//        expected
//       125 -> 2321 -> 55 -> 4 -> 55 -> 125
        list.printList();
        reverseLinkedList(list.headNode);
        list.printList();
    }

    private static void reverseLinkedList(SinglyLinkedList<Integer>.Node headNode) {

        SinglyLinkedList<Integer>.Node current = headNode;
        SinglyLinkedList<Integer>.Node prev = null;
        SinglyLinkedList<Integer>.Node next;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }

        list.headNode = prev;
    }
}
