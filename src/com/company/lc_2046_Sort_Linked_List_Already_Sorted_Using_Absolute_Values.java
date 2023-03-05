package com.company;
import java.util.*;

public class lc_2046_Sort_Linked_List_Already_Sorted_Using_Absolute_Values {
    public ListNode sortLinkedList(ListNode head) {
        var node = head;
        while (node != null && node.next != null) {
            var next = node.next;
            if (next.val < 0) {
                var temp = next.next;
                next.next = head;
                head = next;
                node.next = temp;
            } else {
                node = node.next;
            }
        }
        return head;
    } 
}
