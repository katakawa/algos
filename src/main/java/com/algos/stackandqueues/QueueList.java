package com.algos.stackandqueues;

import java.util.NoSuchElementException;

public class QueueList<T> {

    QueueNode<T> first;
    QueueNode<T> last;

    public void add(T node) {
        QueueNode<T> newQueueNode = new QueueNode<>(node);
        if (last != null) {
            last.next = newQueueNode;
        }
        last = newQueueNode;
        if (first == null) {
            first = newQueueNode;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        QueueNode<T> toReturn = first;
        if (first.next == null) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
        return toReturn.data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

//    public static void main(String[] args) {
//        QueueList<Integer> queueList = new QueueList<>();
//        queueList.add(1);
//        queueList.add(2);
//        queueList.add(3);
//        queueList.remove();
//        queueList.add(4);
//        queueList.add(5);
//        queueList.add(6);
//        while (!queueList.isEmpty()) {
//            System.out.println(queueList.remove());
//        }
//    }

}

class QueueNode<T> {

    public QueueNode(T data) {
        this.data = data;
    }

    T data;
    QueueNode<T> next;
}
