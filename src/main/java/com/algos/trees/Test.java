package com.algos.trees;

public class Test {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.leftNode = node2;
        node1.rightNode = node5;

        node2.leftNode = node3;
        node2.rightNode = node4;

        node5.leftNode = node6;
        node5.rightNode = node7;

        node1.preOrderTraversal(node1);
        System.out.println("*******************");
        node1.inOrderTraversal(node1);
        System.out.println("*******************");
        node1.postOrderTraversal(node1);

    }



}
