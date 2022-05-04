package com.company;

import static java.sql.Types.NULL;

public class lc_938_Range_Sum_of_BST {
    int ans;
    public int rangeSumBST(Node root, int low, int high) {
        ans = 0;
        dfs(root, low, high);
        return ans;
    }

    public void dfs(Node node, int low, int high) {
        if (node != null) {
            if (low <= node.data && node.data <= high)
                ans += node.data;
            if (low < node.data)
                dfs(node.left, low, high);
            if (node.data < high)
                dfs(node.right, low, high);
        }
    }


}

class Node {
    int data;
    Node left;
    Node right;
    Node() {}
    Node(int data) { this.data = data; }
    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}



// Java program to find minimum value node in Binary Search Tree

// A binary tree node


class BinaryTree {

    static Node head;

    /* Given a binary search tree and a number,
     inserts a new node with the given number in
     the correct place in the tree. Returns the new
     root pointer which the caller should then use
     (the standard trick to avoid using reference
     parameters). */
    Node insert(Node node, int data) {

        /* 1. If the tree is empty, return a new,
         single node */
        if (node == null) {
            return (new Node(data));
        } else {

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

            /* return the (unchanged) node pointer */
            return node;
        }
    }

    /* Given a non-empty binary search tree,
     return the minimum data value found in that
     tree. Note that the entire tree does not need
     to be searched. */
    int minvalue(Node node) {
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    static void printTree(Node node){
        if(node == null) return;
        System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null;
        root = tree.insert(root, 10);
        tree.insert(root, 5);
        tree.insert(root, 15);
        tree.insert(root, 3);
        tree.insert(root, 7);
        tree.insert(root, NULL);
        tree.insert(root, 18);
        printTree(root);
        System.out.println("Minimum value of BST is " + tree.minvalue(root));

        int ans;
        int low = 7;
        int hight = 15;
        lc_938_Range_Sum_of_BST MyClass = new lc_938_Range_Sum_of_BST();

        int result =  MyClass.rangeSumBST(root, low, hight);
        System.out.println(result);

    }
}