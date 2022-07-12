package com.company;

public class lc_226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left_temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = left_temp;

        return root;
    }
    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        int val;

    }
}
