package com.algos.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode(0, null);
        LinkedListNode node1 = new LinkedListNode(0, null);
        LinkedListNode node2 = new LinkedListNode(1, null);
        LinkedListNode node3 = new LinkedListNode(2, null);
        LinkedListNode node4 = new LinkedListNode(2, null);
        LinkedListNode node5 = new LinkedListNode(2, null);
        LinkedListNode node6 = new LinkedListNode(4, null);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        removeDuplicates(node);

        LinkedListNode currentNode = node;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    private static void removeDuplicates(LinkedListNode headNode) {

        Set<Integer> set = new HashSet<>();
        LinkedListNode currentNode = headNode;
        LinkedListNode previousNode = null;

        while (currentNode != null) {
            if (!set.contains(currentNode.data)) {
                set.add(currentNode.data);
                previousNode = currentNode;
            } else {
                previousNode.next = currentNode.next;
            }
            currentNode = currentNode.next;
        }

    }

    private static void removeDuplicatesNoBuffer(LinkedListNode headNode) {

        LinkedListNode currentNode = headNode;

        while (currentNode != null) {
            LinkedListNode previousNode = currentNode;
            LinkedListNode nextNode = currentNode.next;

            while (nextNode != null) {
                if (nextNode.data == previousNode.data) {
                    previousNode.next = nextNode.next;
                } else {
                    previousNode = nextNode;
                }
                nextNode = nextNode.next;
            }

            currentNode = currentNode.next;
        }
    }

}

