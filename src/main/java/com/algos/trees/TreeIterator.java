package com.algos.trees;

import java.util.*;

public class TreeIterator {

    public static void main(String[] args) {
        TreeNodeArrChildren node1 = new TreeNodeArrChildren(1);

        TreeNodeArrChildren node2 = new TreeNodeArrChildren(2);
        TreeNodeArrChildren node3 = new TreeNodeArrChildren(3);
        TreeNodeArrChildren node4 = new TreeNodeArrChildren(4);
        List<TreeNodeArrChildren> list1 = new ArrayList<>();
        list1.add(node2);
        list1.add(node3);
        list1.add(node4);

        node1.children = list1;

        TreeNodeArrChildren node5 = new TreeNodeArrChildren(5);
        TreeNodeArrChildren node6 = new TreeNodeArrChildren(6);
        TreeNodeArrChildren node7 = new TreeNodeArrChildren(7);
        List<TreeNodeArrChildren> list2 = new ArrayList<>();
        list2.add(node5);
        list2.add(node6);
        list2.add(node7);

        node2.children = list2;

        TreeNodeArrChildren node8 = new TreeNodeArrChildren(8);
        TreeNodeArrChildren node9 = new TreeNodeArrChildren(9);
        TreeNodeArrChildren node10 = new TreeNodeArrChildren(10);
        List<TreeNodeArrChildren> list3 = new ArrayList<>();
        list3.add(node8);
        list3.add(node9);
        list3.add(node10);

        node4.children = list3;

        TreeNodeArrChildren node20 = new TreeNodeArrChildren(20);
        TreeNodeArrChildren node21 = new TreeNodeArrChildren(21);
        TreeNodeArrChildren node22 = new TreeNodeArrChildren(22);

        List<TreeNodeArrChildren> list6 = new ArrayList<>();
        list6.add(node20);
        list6.add(node21);
        list6.add(node22);

        node6.children = list6;

        iterate(node1);


    }

    static LinkedList<TreeNodeArrChildren> linkedList = new LinkedList<>();

    public static void iterate(TreeNodeArrChildren node) {
        linkedList.addAll(node.children);
        startIteratingBfs();
        System.out.println("**********");
        linkedList.addAll(node.children);
        startIteratingDfs();
    }

    private static void startIteratingBfs() {
        while (!linkedList.isEmpty()) {
            TreeNodeArrChildren currentNode = linkedList.removeFirst();
            currentNode.visit(currentNode);
            if (currentNode.children != null) {
                linkedList.addAll(currentNode.children);
            }
        }
    }

    private static void startIteratingDfs() {
        while (!linkedList.isEmpty()) {
            TreeNodeArrChildren currentNode = linkedList.removeFirst();
            currentNode.visit(currentNode);
            if (currentNode.children != null) {
                linkedList.addAll(0, currentNode.children);
            }
        }
    }
}