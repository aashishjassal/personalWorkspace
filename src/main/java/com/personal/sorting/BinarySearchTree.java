package com.personal.sorting;

public class BinarySearchTree {
    public Node root;
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.printBST(binarySearchTree.root);

    }
    
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    public Node insertRecursive(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            if (value < root.getKey()) {
                root.setLeft(insertRecursive(root.getLeft(), value));
            } else {
                root.setRight(insertRecursive(root.getRight(), value));

            }
        }

        return root;
    }
    
    public void printBST(Node root) {
        if (root != null) {
            printBST(root.getLeft());
            System.out.println(root.getKey());
            printBST(root.getRight());
        }

    }


}
