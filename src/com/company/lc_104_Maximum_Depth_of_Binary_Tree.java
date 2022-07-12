package com.company;

public class lc_104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }
    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        int val;

    }
}
