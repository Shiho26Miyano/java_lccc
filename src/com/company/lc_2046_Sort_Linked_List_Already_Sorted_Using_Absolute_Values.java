package com.company;
import java.util.*;

public class lc_2046_Sort_Linked_List_Already_Sorted_Using_Absolute_Values {
    public ListNode sortLinkedList(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val < 0) {
                //save the node.next.next
                ListNode tempNodeNextNext = node.next.next;
                //below two steps 1.make node.next.next linked to head 2.move head to node.next, eg: head 0 moved to head -5; head move from 0 to 5, move to left/negative
                node.next.next = head;
                head = node.next;
                // push node.next is the old node.next.next so negative node.next is skipped
                node.next = tempNodeNextNext;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}