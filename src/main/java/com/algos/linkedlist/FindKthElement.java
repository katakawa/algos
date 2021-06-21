package com.algos.linkedlist;

public class FindKthElement {

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
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        //System.out.println(findKthElement(node, 3).data);

        findKthToLastElement(node, 0);
    }

    private static LinkedListNode findKthElement(LinkedListNode node, int num) {
        int count = 0;
        LinkedListNode currentNode = node;

        while (currentNode != null) {
            if (count != num) {
                currentNode = currentNode.next;
                count++;
            } else {
                return currentNode;
            }
        }
        return null;
    }


    private static int findKthToLastElement(LinkedListNode node, int k) {
        if (node.next == null) {
            return 0;
        }

        int index = findKthToLastElement(node.next, k) + 1;

        if (index == k) {
            System.out.println(node.data);
        }

        return index;
    }
}
