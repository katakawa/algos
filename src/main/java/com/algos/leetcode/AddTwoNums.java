package com.algos.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNums {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        node4.next = node5;
        node5.next = node6;

        ListNode res = addTwoNumbers(node1, node4);
        System.out.println(res);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = l1;
        ListNode secondNode = l2;

        ListNode firstResNode = null;
        ListNode previousNode = null;

        boolean hasRem = false;
        while (firstNode != null || secondNode != null) {
            int valueA = firstNode != null ? firstNode.val : 0;
            int valueB = secondNode != null ? secondNode.val : 0;
            int res = valueA + valueB;
            if (hasRem) {
                res++;
                hasRem = false;
            }
            int rem = res % 10;
            if (res > 9) {
                hasRem = true;
            }

            ListNode newNode = new ListNode(rem);
            if (previousNode == null) {
                firstResNode = newNode;
                previousNode = newNode;
            } else {
                previousNode.next = newNode;
                previousNode = newNode;
            }

            if (firstNode != null) firstNode = firstNode.next;
            if (secondNode != null) secondNode = secondNode.next;

            if (firstNode == null && secondNode == null && hasRem) {
                previousNode.next = new ListNode(1);
                previousNode = newNode;
            }
        }
        return firstResNode;
    }

}

 class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
 }