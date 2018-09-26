package com.personal.sorting;

public class DiameterOfATree {

    public static void main(String[] args) {
        Tree tree = populateBinaryTree();
        int diameter = heightOfNode(0, tree.getRoot());
        System.out.println("Diameter is: " + diameter);
    }

    private static int heightOfNode(int existHeight, Node node) {
        int height = existHeight;

        if (node == null) {
            return height;
        }
        height++;
        Node leftNode = node.getLeft();
        Node rightNode = node.getRight();
        int leftHeight = heightOfNode(height, leftNode);
        int rightHeight = heightOfNode(height, rightNode);
        return Math.max(leftHeight, rightHeight);
    }

    public static Tree populateBinaryTree() {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        root.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node5);
        root.setRight(node3);
        node3.setLeft(node6);
        node3.setRight(node7);
        node6.setRight(node8);

        Tree tree = new Tree(root);
        return tree;
    }

}
