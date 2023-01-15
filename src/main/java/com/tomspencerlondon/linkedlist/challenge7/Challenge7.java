package com.tomspencerlondon.linkedlist.challenge7;

public class Challenge7 {
    public static void main(String[] args) {
        // Remove duplicates from a linked list
//      Given a linked list remove duplicates from it

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtHead(2);
        list.insertAtHead(10);
        list.insertAtHead(7);
        list.insertAtHead(10);


        list.printList();
        removeDuplicatesFrom(list);
        list.printList();
    }

    private static void removeDuplicatesFrom(SinglyLinkedList<Integer> list) {
        Node prev = list.headNode;
        Node outer = list.headNode;

        while (outer != null) {
            Node inner = outer.nextNode;
            while (inner != null) {
                if (inner.data.equals(outer.data)) {
                    prev.nextNode = inner.nextNode;
                    inner = prev;
                }

                prev = inner;
                inner = inner.nextNode;
            }

            outer = outer.nextNode;
        }


    }
}
