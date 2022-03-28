package com.company;

import java.util.LinkedList;

public class lc_2_Add_two_numbers {
 public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tail = new ListNode(0);
        ListNode dummy = tail;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0) {
            sum += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            sum /= 10;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(1);
        l2.add(3);
        l2.add(4);
        //System.out.println(addTwoNumbers(l1,l2));

    }
}
