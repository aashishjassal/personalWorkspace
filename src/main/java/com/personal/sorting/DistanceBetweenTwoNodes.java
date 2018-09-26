package com.personal.sorting;

public class DistanceBetweenTwoNodes {

    public static void main(String[] args) {
        Tree tree = populateBinaryTree();
        Node first = new Node(8);
        Node second = new Node(5);

        Node lCA = findLCA(tree.getRoot(), first, second);
        System.out.println("LCA is: " + lCA);
        System.out.println("Now find distance between first and LCA");
        int firstDist = findDistance(0, lCA, first);
        System.out.println("Distance between first and LCA: " + firstDist);

        System.out.println("Now find distance between second and LCA");
        int secondDist = findDistance(0, lCA, second);
        System.out.println("Distance between second and LCA: " + secondDist);
        System.out.println("Total Distance: " + (secondDist + firstDist));

    }

    private static Node findLCA(Node node, Node first, Node second) {
        if (node == null) {
            return null;
        }
        if (node.getKey() == first.getKey() || node.getKey() == second.getKey()) {
            return node;
        }

        Node rootLeft = node.getLeft();
        Node rootRight = node.getRight();
        Node leftLCA = findLCA(rootLeft, first, second);
        Node rightLCA = findLCA(rootRight, first, second);
        if (leftLCA != null && rightLCA != null) {
            return node;
        }

        return leftLCA != null ? leftLCA : rightLCA;
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

    private static int findDistance(int existDist, Node lca, Node node) {
        int d = existDist;
        if (lca == null) {
            return 0;
        }
        if (lca.equals(node)) {
            return d;
        } else {
            d++;
            int leftDistance = findDistance(d, lca.getLeft(), node);
            if (leftDistance != 0) {
                return leftDistance;

            }
            int rightDistance = findDistance(d, lca.getRight(), node);
            if (rightDistance != 0) {
                return rightDistance;

            }
        }

        return 0;
    }
}
