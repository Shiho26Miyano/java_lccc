package com.company;
import java.util.*;

public class lc_141_Linked_List_Cycle {
    public boolean hasCycle(ListNode141 head) {
        Set<ListNode141> nodesSeen = new HashSet<ListNode141>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            }
            nodesSeen.add(head);
            head = head.next;
        }
        return false;
    }
}
class ListNode141 {
     int val;
     ListNode141 next;
     ListNode141(int x) {
         val = x;
         next = null;
     }
 }