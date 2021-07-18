package com.algos.leetcode;

import com.algos.linkedlist.LinkedListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node4 = new LinkedListNode(4);
        LinkedListNode node5 = new LinkedListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListNode reversed = reverse(node1);

        System.out.println(reversed);

    }

    /**
     * 1 -> 2 -> 3 -> 4 -> 5
     * 1 <- 2 <- 3 <- 4 <- 5
     * @param origional
     * @return
     */
    public static LinkedListNode reverse(LinkedListNode origional) {
        LinkedListNode node = origional;
        LinkedListNode newLinkedListHead = null;
        LinkedListNode reversed = null;

        while (node != null) {
            reversed = new LinkedListNode(node.data);
            reversed.next = newLinkedListHead;
            newLinkedListHead = reversed;

            node = node.next;
        }

        return reversed;
    }

}
