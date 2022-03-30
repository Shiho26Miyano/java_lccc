package com.company;

import java.util.LinkedList;

public class lc_2_Add_two_numbers {
 public static class ListNode {
     int val;
     ListNode next;
     private int value;

     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     public int getValue() {return value;}
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
        ListNode l1 = new ListNode(8);

        

        System.out.println(l1.getValue());

    }
}
