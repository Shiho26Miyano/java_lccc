package com.company;
import java.util.*;

public class lc_234_Palindrome_Linked_List {
    private ListNodeLc234 frontPointer;

    private boolean recursivelyCheck(ListNodeLc234 currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false;
            if (currentNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNodeLc234 head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }
}
class ListNodeLc234{
    int val;
    ListNodeLc234 next;
    ListNodeLc234() {}
    ListNodeLc234(int val) {this.val = val;}
    ListNodeLc234(int val, ListNodeLc234 next) { this.val = val; this.next = next; }
}

