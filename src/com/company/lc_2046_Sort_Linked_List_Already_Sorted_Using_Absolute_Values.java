package com.company;
import java.util.*;

public class lc_2046_Sort_Linked_List_Already_Sorted_Using_Absolute_Values {
    public ListNode sortLinkedList(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val < 0) {
                ListNode tempNodeNextNext = node.next.next;
                node.next.next = head;
                head = node.next;
                node.next = tempNodeNextNext;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
