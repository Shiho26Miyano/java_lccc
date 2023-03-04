package com.company;
import java.util.*;


public class lc_2046_Sort_Linked_List_Already_Sorted_Using_Absolute_Values {
    public ListNode sortLinkedList(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(curr.val<0) {
                prev.next = curr.next;
                curr.next = head;
                head = curr;
                curr = prev.next;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
