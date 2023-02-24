package com.company;

public class lc_2130_Maximum_Twin_Sum_of_a_Linked_List {

////https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/solutions/2846367/java-recursive-approach-o-n-easy-to-understand-clean-solution/


    int maxSum = 0;
    ListNode nodePair = null;
    public int pairSum(ListNode head) {

        nodePair = head;
        traverse(nodePair);
        return maxSum;

    }

    public void traverse(ListNode node){
        if (node == null) return;
        if (node.next == nodePair) return;
        traverse(node.next);
        maxSum = Math.max(maxSum, nodePair.val + node.val);
        nodePair = nodePair.next;
    }
}


