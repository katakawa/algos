package com.algos.linkedlist;

import java.util.Stack;

public class AddTwoLinkedLists {

    private static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while(l1 != null) {
            stack1.push(l1.data);
            l1 = l1.next;
        }
        while(l2 != null) {
            stack2.push(l2.data);
            l2 = l2.next;
        }

        int carry = 0;
        LinkedListNode head = null;

        while(!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int n1 = stack1.isEmpty() ? 0 : stack1.pop();
            int n2 = stack2.isEmpty() ? 0 : stack2.pop();
            int tmp = n1 + n2 + carry;

            LinkedListNode tail = new LinkedListNode(tmp % 10);

            tail.next = head;
            head = tail;
            carry = tmp / 10;
        }

        return head;
    }
}
