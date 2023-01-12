package com.tomspencerlondon.linkedlist.challenge3;

class Challenge3 {
// Challenge 3: Deletion in Singly Linked List(Delete by Value)
// Based on how we handled the deletion at head strategy,
// let's write the function for deletion by value.

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertAtHead(125);
        list.insertAtHead(2321);
        list.insertAtHead(55);
        list.insertAtHead(4);
        list.insertAtHead(55);
        list.insertAtHead(125);

        list.printList();
        deleteByValue(list, 55);
        list.printList();
    }

    private static void deleteByValue(SinglyLinkedList<Integer> list, int value) {
        Node current = list.headNode;
        Node prev = null;

        while (current != null) {
            if (current.data.equals(value)) {
                if (prev == null) {
                    list.headNode = current.nextNode;
                } else {
                    prev.nextNode = current.nextNode;
                }
            }

            prev = current;
            current = current.nextNode;
        }
    }
}