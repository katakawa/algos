package com.algos.linkedlist;

public class MergeTwoLists {

    public LinkedListNode mergeTwoLists(LinkedListNode linkedListOne, LinkedListNode linkedListTwo) {
        LinkedListNode newList = new LinkedListNode(0);
        LinkedListNode head = newList;

        while (linkedListOne != null && linkedListTwo != null) {
            if (linkedListOne.data <= linkedListTwo.data) {
                head.next = new LinkedListNode(linkedListOne.data);
                linkedListOne = linkedListOne.next;
            } else {
                head.next = new LinkedListNode(linkedListTwo.data);
                linkedListTwo = linkedListTwo.next;
            }
            head = head.next;
        }

        if (linkedListOne == null && linkedListTwo != null) {
            head.next = linkedListTwo;
        }
        if (linkedListTwo == null && linkedListOne != null) {
            head.next = linkedListOne;
        }

        return newList.next;
    }
}