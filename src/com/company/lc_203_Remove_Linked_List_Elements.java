package com.company;
import java.util.*;

public class lc_203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        // initiate sentinel node as ListNode(0) and its predecessor: curr and prev
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        //while curr is not a null pointer,
        while (curr != null) {
            if (curr.val == val) prev.next = curr.next;
            // if find the value, delete the current node
            else prev = curr;
            // ohterwase set prev to be equal to the current node
            curr = curr.next;
        }
        return sentinel.next;

    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
