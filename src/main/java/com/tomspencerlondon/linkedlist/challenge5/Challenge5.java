package com.tomspencerlondon.linkedlist.challenge5;

public class Challenge5 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtHead(21);
        list.insertAtHead(10);
        list.insertAtHead(14);
        list.insertAtHead(7);


        System.out.println(middleNodeFor(list));
    }

    private static Object middleNodeFor(SinglyLinkedList<Integer> list) {
        Node mid = list.headNode;
        Node fast = list.headNode;

        while (mid != null && fast != null && fast.nextNode != null) {
            fast = fast.nextNode.nextNode;
            if (fast != null) {
                mid = mid.nextNode;
            }
        }


        return mid.data;
    }


}
