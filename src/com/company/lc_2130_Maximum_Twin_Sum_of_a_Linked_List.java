package com.company;

public class lc_2130_Maximum_Twin_Sum_of_a_Linked_List {
    int maxSum = Integer.MIN_VALUE;
    ListNode nodePtr = null;

    public int pairSum(ListNode head) {
        nodePtr = head;
        traverse(head);
        return maxSum;
    }

    public ListNode traverse(ListNode node) {
        if (node == null) return null;
        if (node.next == nodePtr) return null;
        traverse(node.next);
        maxSum = Math.max(maxSum, nodePtr.val + node.val);
        nodePtr = nodePtr.next;
        return nodePtr;
    }
    
////https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/solutions/2846367/java-recursive-approach-o-n-easy-to-understand-clean-solution/

    public int pairSum2(ListNode head) {
        nodePtr = head;
        traverse2(head);
        return maxSum;
    }

    public void traverse2(ListNode node) {
        if (node == null) return;
        if (node.next == nodePtr) return;
        traverse2(node.next);
        maxSum = Math.max(maxSum, nodePtr.val + node.val);
        nodePtr = nodePtr.next;
    }
}


