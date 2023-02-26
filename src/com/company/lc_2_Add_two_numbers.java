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

    int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;

        int sum = val1 + val2 + carry;
        carry = sum/10;

        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;

        ListNode ans = new ListNode(sum%10, addTwoNumbers(l1, l2));

        return ans;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(8);
        System.out.println(l1.getValue());

    }
}
