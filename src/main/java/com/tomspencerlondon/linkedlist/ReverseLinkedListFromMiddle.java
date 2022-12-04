package com.tomspencerlondon.linkedlist;

import java.util.LinkedList;

public class ReverseLinkedListFromMiddle {

  //  I/P-- Even
//  1 --> 3--> 4--> 2--> 7--> 8--> Null
//                                 ^                                   Fast
//                  ^                                   Slow
//
//
//  O/P--
//  1-->3--> 4--> 8--> 7--> 2--> Null
//
// I/P -- Odd
//  1 --> 3 --> 4 --> 2 --> 7 --> Null
//              ^
//  O/P --
//  1 --> 3 --> 4 --> 7 --> 2 --> Null
  // 4->
//  reversedList = 7-> 2 -> Null
//  1. Observations about the problem
//  - finding the middle node
//      - fast and slow pointer iteration
//      - count number of elements
//      - 2 sub problems: even number, odd number
//
//  - reverse linked list
//    -
//  2. Solution approaches
//  3. Design the code
//  4. Modularity -- Need to work
//  5. actual code -- fine-- practice is neede
  static Node head;

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
    ReverseLinkedListFromMiddle list = new ReverseLinkedListFromMiddle();
    list.head = new Node(1);
    list.head.next = new Node(3);
    list.head.next.next = new Node(4);
    list.head.next.next.next = new Node(2);
    list.head.next.next.next.next = new Node(7);
    list.printList(head);
    Node middle = list.findMiddle(head);
    Node  reverseListNode;
    if (list.isEven(head)) {
      reverseListNode = list.reverseList(middle);
    } else {
      reverseListNode = list.reverseList(middle.next);
    }

     Node result = list.attachList(head, reverseListNode, middle);
    System.out.println("Output: ");
     list.printList(result);
  }

  private Node attachList(Node currentHead, Node reversListNode, Node middle) {
    Node result = currentHead;
    while (currentHead.data == middle.data) {
      currentHead.next = reversListNode;
    }
    return result;
  }

  //
  private Node reverseList(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  private void printList(Node node) {
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }

  //  1 -> 3 -> 4 -> 7 -> 2
//                         ^
  private boolean isEven(Node current) {
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }

    return count % 2 == 0;
  }

  private Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

}

class Node {

  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}
