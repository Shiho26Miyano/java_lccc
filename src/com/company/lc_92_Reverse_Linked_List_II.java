package com.company;
import java.util.*;


public class lc_92_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> list = new ArrayList<>();
        if(left == right) return head;

        rec(head,list,left , right , 0);
        return head;
    }

    public void rec(ListNode node , List<Integer> list , int left , int right , int curr){
        if(node == null) return;
        curr++;

        if(curr >= left && curr <= right){
            list.add(node.val);
        }
        if(curr > right){
            return;
        }
        rec(node.next , list,left , right , curr);
        if(curr >= left && curr <= right){
            node.val = list.get(0);
            list.remove(0);
        }
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

