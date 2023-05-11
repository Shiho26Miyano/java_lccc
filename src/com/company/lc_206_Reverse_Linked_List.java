package com.company;
import java.util.*;

public class lc_206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode preSetTail = null;
        ListNode curr = head;
        while(curr != null){
            ListNode oldNext = curr.next;
            curr.next = preSetTail;
            preSetTail = curr;
            curr = oldNext;
        }
        return preSetTail;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

