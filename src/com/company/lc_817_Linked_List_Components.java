package com.company;
import java.util.*;

public class lc_817_Linked_List_Components {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int i : nums) hashset.add(i);
        int res = 0;
        while(head != null){
            if (hashset.contains(head.val) && (head.next == null || !hashset.contains(head.next.val))) res++;
            head = head.next;
        }
        return res;

    }
}


