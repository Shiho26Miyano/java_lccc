package com.company;
import java.util.*;

// Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.nex
public class lc_206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode futureTail = null;
        ListNode curr = head;

        while(curr != null){
            ListNode previousNext = curr.next;
            curr.next = futureTail;
            futureTail = curr;
            curr = previousNext;
        }
        return futureTail;
        
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

