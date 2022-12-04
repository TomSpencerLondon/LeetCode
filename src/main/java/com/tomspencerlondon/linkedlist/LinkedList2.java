package com.tomspencerlondon.linkedlist;

public class LinkedList2 {

  public static void main(String[] args) {
    //  I/P-- Even
//  1 --> 3--> 4--> 2--> 7--> 8--> Null
    //  O/P--
//  1-->3--> 4--> 8--> 7--> 2--> Null
// I/P -- Odd
//  1 --> 3 --> 4 --> 2 --> 7 --> Null
//              ^
//  O/P --
//  1 --> 3 --> 4 --> 7 --> 2 --> Null
    SinglyLinkedList<Object> list = new SinglyLinkedList<>();
    list.insertAtHead(8);
    list.insertAtHead(7);
    list.insertAtHead(2);
    list.insertAtHead(4);
    list.insertAtHead(3);
    list.insertAtHead(1);

    list.printList();

    SinglyLinkedList.Node prev = null;
    SinglyLinkedList.Node current = findMiddle(list).nextNode;
    SinglyLinkedList.Node next = current.nextNode;

    while (current != null) {
      current.nextNode = prev;
      prev = current;
      current = next;
      if (next != null) {
        next = next.nextNode;
      }
    }

    SinglyLinkedList<Object>.Node nextNode = list.headNode.nextNode.nextNode.nextNode;
    SinglyLinkedList<Object>.Node currentNode = list.headNode;

    while (currentNode.data != findMiddle(list).nextNode.data) {
      currentNode = currentNode.nextNode;
    }

    currentNode.nextNode = prev;
    System.out.println("reversed list: ");
    list.printList();
  }

  public static SinglyLinkedList.Node findMiddle(SinglyLinkedList list) {
    SinglyLinkedList.Node slow = list.headNode;
    SinglyLinkedList.Node fast = list.headNode;

    while (slow != null && fast != null && fast.nextNode != null && fast.nextNode.nextNode != null) {

      slow = slow.nextNode;
      fast = fast.nextNode.nextNode;

    }

    return slow;
  }


}
