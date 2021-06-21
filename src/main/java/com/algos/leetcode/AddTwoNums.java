package com.algos.leetcode;

import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNums {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        node4.next = node5;
        node5.next = node6;

        ListNode res = addTwoNumbers(node1, node4);

        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode first = res;
        int sum = 0;
        boolean rem = false;
        while (l1 != null && l2 != null) {
            int interSum = l1.val + l2.val + (rem == false ? 0 : 1);
            res.val = interSum % 10;
            rem = interSum >= 10;

            if (l1.next != null) {
                res.next = new ListNode();
                res = res.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        return first;
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