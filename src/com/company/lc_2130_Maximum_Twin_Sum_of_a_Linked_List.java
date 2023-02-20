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
}


