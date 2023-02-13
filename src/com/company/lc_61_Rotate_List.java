package com.company;
import java.util.*;

public class lc_61_Rotate_List {
    // recursion
    public ListNode61 rotateRight(ListNode61 head, int k) {
        if (head == null || head.next == null)  return head;

        ListNode61 curr = head;
        int length = 2;

        while (curr.next.next != null) {
            curr = curr.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head;

        ListNode61 newHead = curr.next;
        newHead.next = head;
        curr.next = null;


        return rotateRight(newHead, k-1);
    }
}
 class ListNode61 {
     int val;
     ListNode61 next;
     ListNode61() {}
     ListNode61(int val) { this.val = val; }
     ListNode61(int val, ListNode61 next) { this.val = val; this.next = next; }
 }

 