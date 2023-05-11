package com.company;
//https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/solutions/2023851/java-recursive-beat-100-similar-to-flatten-tree/
public class lc_430_Flatten_a_Multilevel_Doubly_Linked_List {
    Node430 prev = null;

    public Node430 flatten(Node430 head) {
        dfsHelper(head);
        return head;
    }

    public void dfsHelper(Node430 current) {
        if (current == null) return;
        // postorder traversal, going right first or next in this case
        dfsHelper(current.next);
        dfsHelper(current.child);
        // don't forget to set prev.prev pointer
        if (prev != null) prev.prev = current;
        // see explanation below
        current.next = prev;
        current.child = null;
        prev = current;
    }
}
class Node430 {
    public int val;
    public Node430 prev;
    public Node430 next;
    public Node430 child;
};

