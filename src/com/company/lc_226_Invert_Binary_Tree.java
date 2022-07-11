package com.company;

public class lc_226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        int val;

    }
}
