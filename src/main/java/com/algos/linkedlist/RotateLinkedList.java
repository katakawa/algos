package com.algos.linkedlist;

public class RotateLinkedList {

    public LinkedListNode rotateRight(LinkedListNode head, int shiftByN) {
        if (head == null) return null;

        int linkedListLength = 0;
        LinkedListNode tmp = head;

        while (tmp != null) {
            linkedListLength++;
            tmp = tmp.next;
        }

        shiftByN = shiftByN % linkedListLength;
        LinkedListNode pointerOne = head;
        LinkedListNode pointerTwo = head;

        //get pointerTwo to the end of 1st part
        for (int i = 0; i < shiftByN; i++) {
            pointerTwo = pointerTwo.next;
        }

        while (pointerTwo.next != null) {
            pointerOne = pointerOne.next;
            pointerTwo = pointerTwo.next;
        }

        pointerTwo.next = head;
        LinkedListNode newHead = pointerOne.next;
        pointerOne.next = null;

        return newHead;
    }
}