package com.company;
import java.util.*;


public class lc_1265_Print_Immutable_Linked_List_in_Reverse {
    // I got what does mean recursion!!!! a little happiness
    //1 Iterative - recursion
    public void printLinkedListInReverse1(ImmutableListNode head) {
        if (head == null) {
            return;
        }
        printLinkedListInReverse1(head.getNext());
        head.printValue();
    }

    public void printLinkedListInInOrder1(ImmutableListNode head) {
        if (head == null) {
            return;
        }
        head.printValue();
        printLinkedListInReverse1(head.getNext());

    }
    
    // 2 Iterative - stack
    public void printLinkedListInReverse2(ImmutableListNode head) {
        // push inserts and element into the stack, pop removes an element from the top of the stack.
        Stack<ImmutableListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.getNext();
        }
        while (!stack.isEmpty()) {
            stack.pop().printValue();
        }
    }
    public void printLinkedListInInOrder2(ImmutableListNode head) {

        while (head != null){
            head.printValue();
            head = head.getNext();

        }

    }
}

 interface ImmutableListNode {
     public void printValue(); // print the value of this node.
     public ImmutableListNode getNext(); // return the next node.
 };;