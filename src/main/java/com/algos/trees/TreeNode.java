package com.algos.trees;

public class TreeNode {

    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public void visit(TreeNode node) {
        System.out.println(node.data);
    }

    public void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        visit(node);
        preOrderTraversal(node.leftNode);
        preOrderTraversal(node.rightNode);
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftNode);
        visit(node);
        inOrderTraversal(node.rightNode);
    }

    public void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.leftNode);
        postOrderTraversal(node.rightNode);
        visit(node);
    }
}
