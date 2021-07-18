package com.algos.linkedlist;

public class SwapPairs {

    public LinkedListNode swapPairs(LinkedListNode head) {
        
        LinkedListNode prevNode = new LinkedListNode(0);
        prevNode.next = head;
        LinkedListNode newHead = prevNode;
        
        while(prevNode.next!=null && prevNode.next.next!=null){
            LinkedListNode node1 = prevNode.next;
            LinkedListNode node2 = node1.next;
            LinkedListNode nextNode = node2.next;

            prevNode.next = node2;
            node2.next = node1;
            node1.next = nextNode;

            prevNode = node1;
        }
        
        return newHead.next;
    }
}