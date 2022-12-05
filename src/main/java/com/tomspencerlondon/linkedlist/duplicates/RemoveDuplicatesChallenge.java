package com.tomspencerlondon.linkedlist.duplicates;


class RemoveDuplicatesChallenge {

  public static void main(String[] args) {
    SinglyLinkedList<Object> list = new SinglyLinkedList<>();

    list.insertAtHead(125);
    list.insertAtHead(2321);
    list.insertAtHead(55);
    list.insertAtHead(4);
    list.insertAtHead(55);
    list.insertAtHead(125);

//    4->2321->4->55->1000

//    list.insertAtHead(1000);
//    list.insertAtHead(55);
//    list.insertAtHead(4);
//    list.insertAtHead(2321);
//    list.insertAtHead(4);

    removeDuplicates(list);
    list.printList();
  }

  public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
    if (list.getSize() == 0) {
      return;
    }

    if (list.getSize() == 1) {
      return;
    }

    SinglyLinkedList.Node current = list.getHeadNode();
    SinglyLinkedList.Node inner = list.getHeadNode();
    SinglyLinkedList.Node prev = current;

    while (current != null) {
      while (inner != current) {
        if (inner.data.equals(current.data)) {
          prev.nextNode = current.nextNode;
          current = prev;
        }

        inner = inner.nextNode;
      }
      prev = current;
      current = current.nextNode;
      inner = list.getHeadNode();
    }

    return;
  }
}
