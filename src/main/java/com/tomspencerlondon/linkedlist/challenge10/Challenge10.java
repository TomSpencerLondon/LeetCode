package com.tomspencerlondon.linkedlist.challenge10;

public class Challenge10 {
    public static void main(String[] args) {
        // Return nth node from end

        SinglyLinkedList<Integer> listA = new SinglyLinkedList<>();
        listA.insertAtHead(2);
        listA.insertAtHead(8);
        listA.insertAtHead(7);
        listA.insertAtHead(10);
        listA.insertAtHead(14);
        listA.insertAtHead(21);

        System.out.println(nthNodeFromEnd(listA, 2));
    }

    public static int nthNodeFromEnd(SinglyLinkedList<Integer> list, int n) {
        Node current = list.headNode;
        int result = 0;

        int size = 0;
        while (current != null) {
            current = current.nextNode;
            size++;
        }

        int nthFromEnd = size - n;
        System.out.println(nthFromEnd);

        current = list.headNode;
        int index = 0;
        while (current != null) {
            if (index == nthFromEnd) {
                result = (int) current.data;
            }
            current = current.nextNode;
            index++;
        }

        return result;
    }
}
