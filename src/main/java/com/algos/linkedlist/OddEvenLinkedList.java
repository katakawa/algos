package com.algos.linkedlist;

public class OddEvenLinkedList {

    public LinkedListNode oddEvenList(LinkedListNode head) {
        if (head == null) return null;

        LinkedListNode odd = head;
        LinkedListNode even = head.next;
        LinkedListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}