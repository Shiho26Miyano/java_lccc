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


        // prev slow is the pointer which is 1 behind the middle point
        // so for e.g - [1,2,3,4,5] (odd length case) = when slow reaches 3, prev_slow is at 2 and we can delete 3 by 2.next = 3.next, i.e - [2 --> 4]
        // similarly - [1, 2, 3, 4] (even length case) = when slow reaches 3, prev_slow is at 2 and we can delete 3 by 2.next = 3.next, i.e - [2 --> 4]
        preSlow.next = slow.next;
        return head;

    }

}
