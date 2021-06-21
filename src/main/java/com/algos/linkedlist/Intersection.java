package com.algos.linkedlist;

public class Intersection {

    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode(1, null);
        LinkedListNode node1 = new LinkedListNode(2, null);
        LinkedListNode node2 = new LinkedListNode(3, null);
        LinkedListNode node3 = new LinkedListNode(4, null);
        LinkedListNode node4 = new LinkedListNode(5, null);
        LinkedListNode node5 = new LinkedListNode(6, null);
        LinkedListNode node6 = new LinkedListNode(7, null);

        node.next = node1;
        node1.next = node2;
        node2.next = node4;

        node3.next = node4;


        node4.next = node5;
        node5.next = node6;

        LinkedListNode nodeInters = findIntersection(node, node3);
        System.out.println(nodeInters.data);
    }

    private static LinkedListNode findIntersection(LinkedListNode node1, LinkedListNode node2) {
        int length1 = 0;
        int length2 = 0;

        LinkedListNode currentNode = node1;
        while (currentNode != null) {
            length1++;
            currentNode = currentNode.next;
        }

        currentNode = node2;
        while (currentNode != null) {
            length2++;
            currentNode = currentNode.next;
        }

        LinkedListNode starting1 = node1;
        LinkedListNode starting2 = node2;

        int diff = length1 - length2;
        if (diff > 0) {
            while (diff != 0) {
                starting1 = starting1.next;
                diff--;
            }
        }
        if (diff < 0) {
            while (diff != 0) {
                starting2 = starting2.next;
                diff++;
            }
        }

        while (starting1 != null) {
            if (starting1 == starting2) {
                return starting1;
            }
            starting1 = starting1.next;
            starting2 = starting2.next;
        }

        return null;

    }

}
