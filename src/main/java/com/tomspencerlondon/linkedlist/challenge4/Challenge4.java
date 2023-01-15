package com.tomspencerlondon.linkedlist.challenge4;

public class Challenge4 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertAtHead(125);
        list.insertAtHead(2321);
        list.insertAtHead(55);
        list.insertAtHead(4);
        list.insertAtHead(55);
        list.insertAtHead(125);

        System.out.println(length(list));
    }

    private static int length(SinglyLinkedList<Integer> list) {
        int length = 0;
        Node current = list.headNode;

        while (current != null) {
            current = current.nextNode;
            length++;
        }

        return length;
    }
}
