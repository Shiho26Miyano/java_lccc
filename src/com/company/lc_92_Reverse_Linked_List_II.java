package com.company;
import java.util.*;


public class lc_92_Reverse_Linked_List_II {
    private ListNode successor = null;

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null)
            return null;
        //When m =1, it is the same problem as reversing the first n nodes of the linkedlist
        if(m == 1){
            return reverse(head,n);
        }

        head.next = reverseBetween(head.next,m-1,n-1);
        return head;
    }

    //Reverse the n-nodes after the given head
    private ListNode reverse(ListNode head,int n){
        if(n == 1){
            successor = head.next;
            return head;
        }

        ListNode tail = reverse(head.next,n-1);
        head.next.next = head;
        head.next = successor;
        return tail;
    }
}

//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        List<Integer> list = new ArrayList<>();
//        if(left == right) return head;
//
//        rec(head,list,left , right , 0);
//        return head;
//    }
//
//    public void rec(ListNode node , List<Integer> list , int left , int right , int curr){
//        if(node == null) return;
//        curr++;
//
//        if(curr >= left && curr <= right){
//            list.add(node.val);
//        }
//        if(curr > right){
//            return;
//        }
//        rec(node.next , list,left , right , curr);
//        if(curr >= left && curr <= right){
//            node.val = list.get(0);
//            list.remove(0);
//        }
//    }

