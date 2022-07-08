package com.company;
import java.util.*;

public class lc_101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }


    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        int val;

    }

}
