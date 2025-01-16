package com.mycompany.binarytrees;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTrees {

    public boolean Property(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        int leftData = (node.left != null) ? node.left.key : 0;
        int rightData = (node.right != null) ? node.right.key : 0;
        if (node.key == leftData + rightData) {
            return Property(node.left) && Property(node.right);
        }

        return false;
    }

    public int calculation(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftLevel = calculation(node.left);
            int rightLevel = calculation(node.right);
            return Math.max(leftLevel, rightLevel) + 1;
        }
    }

    void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    Node root;

    BinaryTrees(int key) {
        root = new Node(key);
    }

    BinaryTrees() {
        root = null;
    }

    public String checkType(Node node) {
        int totalNodes = countNodes(node);

        if (isComplete(node, 0, totalNodes) && isFull(node)) {
            return "The tree is both complete and full.";
        } else if (isComplete(node, 0, totalNodes)) {
            return "The tree is complete but not full.";
        } else if (isFull(node)) {
            return "The tree is full but not complete.";
        } else {
            return "The tree is neither complete nor full.";
        }
    }

    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public boolean isComplete(Node node, int index, int totalNodes) {
        if (node == null) {
            return true;
        }

        if (index >= totalNodes) {
            return false;
        }

        return isComplete(node.left, 2 * index + 1, totalNodes) && isComplete(node.right, 2 * index + 2, totalNodes);
    }

    public boolean isFull(Node node) {
        if (node == null) {
            return true;
        }

        if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
            return false;
        }

        return isFull(node.left) && isFull(node.right);
    }

    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();
        tree.root = new Node(10);
        Node a = new Node(4);
        tree.root.left = a;
        Node b = new Node(6);
        tree.root.right = b;

        a.left = new Node(2);
        a.right = new Node(2);
        b.left = new Node(3);
        b.right = new Node(3);

        System.out.println("Pre-Order:");
        tree.printPreorder(tree.root);
        System.out.println("\nPost-Order:");
        tree.printPostorder(tree.root);
        System.out.println("\nIn-Order:");
        tree.printInorder(tree.root);

        System.out.println("\nLevel of tree: " + tree.calculation(tree.root));

        if (tree.Property(tree.root)) {
            System.out.println("The tree satisfies the  Property.");
        } else {
            System.out.println("The tree does not satisfy the Property.");
        }
        System.out.println(tree.checkType(tree.root));
    }
}
