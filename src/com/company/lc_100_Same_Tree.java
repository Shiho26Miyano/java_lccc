package com.company;

public class lc_100_Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (q == null || p == null) return false;
        return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        int val;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
