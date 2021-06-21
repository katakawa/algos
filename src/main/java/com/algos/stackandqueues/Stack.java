package com.algos.stackandqueues;

import java.util.EmptyStackException;

public class Stack<T> {

    private int elementsInStack;

    public Stack() {
    }

    public Stack(StackNode<T> head) {
        this.head = head;
    }

    StackNode<T> head;

    public void push(T node) {
        StackNode<T> newStackNode = new StackNode<>(node);
        newStackNode.next = head;
        this.head = newStackNode;
        elementsInStack++;
    }

    public T pop() {
        if (head == null) throw new EmptyStackException();
        StackNode<T> res = head;
        head = head.next;
        elementsInStack--;
        return res.data;
    }

    public T peek() {
        return head == null ? null : head.data;
    }

    public int getElementsInStack() {
        return elementsInStack;
    }

    public boolean isEmpty() {
        return head == null;
    }

}

class StackNode<T> {

    public StackNode(T data) {
        this.data = data;
    }

    T data;
    StackNode next;
}



//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>(new StackNode<>(1));
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        while (stack.peek() != null) {
//            System.out.println(stack.pop());
//        }
//
//        System.out.println("***************");
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        while (stack.peek() != null) {
//            System.out.println(stack.pop());
//        }
//
//    }