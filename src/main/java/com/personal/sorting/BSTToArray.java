package com.personal.sorting;

import java.util.ArrayList;
import java.util.List;

public class BSTToArray {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(10);
        binarySearchTree.printBST(binarySearchTree.root);
        System.out.println("Sorted array: " + getSortedList(binarySearchTree));

    }

    private static List<Integer> getSortedList(BinarySearchTree binarySearchTree) {
        List<Integer> l = new ArrayList<>();
        Node node = binarySearchTree.root;
        populateValue(node, l);
        return l;
    }

    private static void populateValue(Node node, List<Integer> list) {

        Node left = node.getLeft();
        Node right = node.getRight();
        // First put sorted left node
        if (left != null) {
            populateValue(left, list);
        }

        // Now, the key element
        list.add(node.getKey());

        // Last, put sorted right node

        if (right != null) {
            populateValue(right, list);
        }

    }

}
