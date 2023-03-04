package com.company;
import java.util.*;


public class lc_2046_Sort_Linked_List_Already_Sorted_Using_Absolute_Values {
    public ListNode sortLinkedList(ListNode head) {
        ListNode headCpy = head, prev = head;
        head = head.next; // move one step to avoid checking for prev != null
        while (head != null)
            if (head.val < 0) { // replace head
                prev.next = head.next;
                head.next = headCpy;
                headCpy = head;
                head = prev.next;
            } else {
                prev = head;
                head = head.next;
            }
        return headCpy;
    }
}
