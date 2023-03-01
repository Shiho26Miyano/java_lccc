package com.company;

public class lc_2095_Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null | head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode preSlow = null;

        while(fast != null && fast.next != null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        preSlow.next = slow.next;
        return head;

    }

}
