package com.company;
import java.util.*;

public class lc_2046_Sort_Linked_List_Already_Sorted_Using_Absolute_Values {
    public ListNode sortLinkedList(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val < 0) {
                //save the node.next.next
                ListNode tempNodeNextNext = node.next.next;
                //push node.next.next to current head
                node.next.next = head;
                //push head to node.next which is the negative node
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
