package com.algos.trees;

import java.util.List;

public class TreeNodeArrChildren {

    int data;
    List<TreeNodeArrChildren> children;

    public TreeNodeArrChildren(int data) {
        this.data = data;
    }

    public TreeNodeArrChildren(int data, List<TreeNodeArrChildren> children) {
        this.data = data;
        this.children = children;
    }

    public void visit(TreeNodeArrChildren node) {
        System.out.println(node.data);
    }
}
