/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayintobst;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class ArrayIntoBST {

    public static Node ArrayIntoBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.left = ArrayIntoBST(arr, start, mid - 1);
        node.right = ArrayIntoBST(arr, mid + 1, end);

        return node;
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    void printPreOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
        Node root = ArrayIntoBST(sortedArray, 0, sortedArray.length - 1);
        ArrayIntoBST tree = new ArrayIntoBST();

        System.out.println("Pre-Order Traversal:");
        tree.printPreOrder(root);
        System.out.println();

        System.out.println("Post-Order Traversal:");
        tree.printPostOrder(root);
        System.out.println();

        System.out.println("In-Order Traversal:");
        tree.printInOrder(root);
        System.out.println();
    }
}
