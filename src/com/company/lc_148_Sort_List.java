package com.company;
import java.util.*;

public class lc_148_Sort_List {
    public ListNode sortList(ListNode head) {

        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int a[]=new int[count];
        count=0;
        while(temp!=null){
            a[count++]=temp.val;
            temp=temp.next;
        }
        temp=head;
        Arrays.sort(a);
        int k=0;
        while(temp!=null){
            temp.val=a[k++];
            temp=temp.next;
        }
        return head;

    }
}
