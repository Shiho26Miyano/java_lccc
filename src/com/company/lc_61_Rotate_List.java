package com.company;
import java.util.*;

public class lc_61_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)  return head;

        ListNode curr = head;
        int length = 2;

        while (curr.next.next != null) {
            curr = curr.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head;

        ListNode newHead = curr.next;
        newHead.next = head;
        curr.next = null;


        return rotateRight(newHead, k-1);
    }
}
