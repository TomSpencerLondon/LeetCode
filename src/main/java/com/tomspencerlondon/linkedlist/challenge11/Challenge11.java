package com.tomspencerlondon.linkedlist.challenge11;

public class Challenge11 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.insertAtHead(1);
        doublyLinkedList.insertAtHead(2);
        doublyLinkedList.insertAtHead(3);
        doublyLinkedList.insertAtHead(2);
        doublyLinkedList.insertAtHead(1);

        System.out.println(isPalindrome(doublyLinkedList));
    }

    private static boolean isPalindrome(DoublyLinkedList<Integer> list) {
        DoublyLinkedList.Node head = list.headNode;
        DoublyLinkedList.Node tail = list.tailNode;

        while (head != null && tail != null) {
            if (!head.data.equals(tail.data)) {
                return false;
            }

            head = head.nextNode;
            tail = tail.prevNode;
        }

        return true;
    }
}
