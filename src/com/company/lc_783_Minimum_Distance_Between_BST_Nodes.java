package com.company;

public class lc_783_Minimum_Distance_Between_BST_Nodes {
    // recursion
    Integer res = Integer.MAX_VALUE, pre = null;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) minDiffInBST(root.left);
        if (pre != null) res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null) minDiffInBST(root.right);
        return res;
    }
}
