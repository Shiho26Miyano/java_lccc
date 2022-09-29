package com.company;

public class lc_24_Swap_Nodes_in_Pairs {
    //recursion
    public ListNodeLc24 swapPairs(ListNodeLc24 head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNodeLc24 n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
    //iteration
    public ListNodeLc24 swapPairs2(ListNodeLc24 head) {
        if (head == null || head.next == null) return head;
        ListNodeLc24 cur = head;
        ListNodeLc24 newHead = head.next;
        while (cur != null && cur.next != null) {
            ListNodeLc24 tmp = cur;
            cur = cur.next;
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
            if (cur != null && cur.next != null) tmp.next = cur.next;
        }
        return newHead;
    }
}
class ListNodeLc24{
    int val;
    ListNodeLc24 next;
    ListNodeLc24() {}
    ListNodeLc24(int val) {this.val = val;}
    ListNodeLc24(int val, ListNodeLc24 next) { this.val = val; this.next = next; }
}

