package com.mycompany.binaryexpressiontree;
public class BinaryExpressionTree {
    static class Node {  
        String key;
        Node left, right;
        public Node(String item) {
            key = item;
            left = right = null;
        }
    }
    Node root;
    BinaryExpressionTree() {
        root = null;
    }
    void printInOrder(Node node) {
        if (node == null)
            return;
        if (node.left != null || node.right != null) {
            System.out.print("(");
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
        if (node.left != null || node.right != null) {
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        BinaryExpressionTree tree = new BinaryExpressionTree();
        Node root = new Node("/");
        Node multiplyNode = new Node("*");
        root.left = multiplyNode;
        Node addNode = new Node("+");
        root.right = addNode;
        Node addNodeLeft = new Node("+");
        multiplyNode.left = addNodeLeft;
        addNodeLeft.left = new Node("5");
        addNodeLeft.right = new Node("2");
        Node subtractNode = new Node("-");
        multiplyNode.right = subtractNode;
        subtractNode.left = new Node("2");
        subtractNode.right = new Node("1");
        addNode.left = new Node("2");
        addNode.right = new Node("9");
        tree.root = root;
        System.out.println("In-Order Traversal (Expression):");
        tree.printInOrder(tree.root);
        System.out.println();
    }
}
