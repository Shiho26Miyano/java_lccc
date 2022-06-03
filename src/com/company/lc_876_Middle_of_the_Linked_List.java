package com.company;
import java.util.*;
public class lc_876_Middle_of_the_Linked_List {

    public ListNode876 middleNode(ListNode876 head) {
        ListNode876 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    
    public class ListNode876 {
        int val;
        ListNode876 next;
        ListNode876() {}
        ListNode876(int val) { this.val = val; }
        ListNode876(int val, ListNode876 next) { this.val = val; this.next = next; }
    }
}
