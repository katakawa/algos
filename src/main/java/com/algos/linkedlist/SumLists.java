package com.algos.linkedlist;

public class SumLists {

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

        node4.next = node5;
        node5.next = node6;


        LinkedListNode currentNode = findSum(node, node4);
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    private static LinkedListNode findSum(LinkedListNode node1, LinkedListNode node2) {
        // check for nulls here
        LinkedListNode firstNumber = node1;
        LinkedListNode secondNumber = node2;

        LinkedListNode head = null;
        LinkedListNode tail = null;
        boolean carryOver = false;

        while (true) {

            if (firstNumber == null && secondNumber == null) {
                break;
            }

            int sum = 0;

            if (head == null) {
                sum = firstNumber.data + secondNumber.data;
                if (sum > 9) carryOver = true;
                head = new LinkedListNode(sum % 10, null);
                tail = head;
            } else {
                int a = 0;
                int b = 0;

                if (firstNumber != null) {
                    a = firstNumber.data;
                }
                if (secondNumber != null) {
                    b = secondNumber.data;
                }

                sum = a + b;
                if (carryOver) {
                    sum++;
                    carryOver = false;
                }

                if (sum > 9) {
                    carryOver = true;
                }

                LinkedListNode newTail = new LinkedListNode(sum % 10, null);
                tail.next = newTail;

                tail = newTail;
            }

            if (firstNumber != null) {
                firstNumber = firstNumber.next;
            }
            if (secondNumber != null) {
                secondNumber = secondNumber.next;
            }
        }

        return head;
    }

}
