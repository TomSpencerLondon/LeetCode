package com.tomspencerlondon.linkedlist.reverseLinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        com.tomspencerlondon.linkedlist.reverseLinkedList.SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertAtHead(125);
        list.insertAtHead(2321);
        list.insertAtHead(55);
        list.insertAtHead(4);
        list.insertAtHead(55);
        list.insertAtHead(125);

//        expected
//       125 -> 2321 -> 55 -> 4 -> 55 -> 125
        list.printList();
        reverseLinkedList(list);
        list.printList();
    }

    private static void reverseLinkedList(SinglyLinkedList<Integer> list) {
        SinglyLinkedList.Node current = list.getHeadNode();
        SinglyLinkedList.Node head = current;
        SinglyLinkedList.Node prev = null;
        SinglyLinkedList.Node next = null;
        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }

        list.headNode = prev;
    }
}
// input = 125 -> 55 -> 4 -> 55 -> 2321 -> 125
// output = 125 -> 2321 -> 55 -> 4 -> 55 -> 125

// current = 125
// head = 125
// prev = null
// next = null
// outputSoFar = 125

// next = 55
// current.nextNode = null
// prev = 125
// current = 55
// outputSoFar = 55 -> 125

// next = 4
// current.nextNode = 125
// prev = 55
// current = 4

// outputSoFar = 4 -> 55 -> 125

// next = 55
// current.nextNode = 55
// prev = 4
// current = 55
// outputSoFar = 55 -> 4 -> 55 -> 125

// next = 2321
// current.nextNode = 4
// prev = 55
// current = 2321
// outputSoFar = 2321 -> 55 -> 4 -> 55 -> 125

// next = 125
// current.nextNode = 55
// prev = 2321
// current = 125
// outputSoFar = 125 -> 2321 -> 55 -> 4 -> 55 -> 125
