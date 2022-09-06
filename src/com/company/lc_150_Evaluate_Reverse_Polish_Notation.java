package com.company;
import java.util.*;
public class lc_150_Evaluate_Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String s: tokens) {
            if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
                int right = deque.removeFirst();
                int left = deque.removeFirst();
                if (s.equals("*")) {
                    deque.addFirst(left * right);
                }
                if (s.equals("/")) {
                    deque.addFirst(left / right);
                }

                if (s.equals("+")) {
                    deque.addFirst(left + right);
                }

                if (s.equals("-")) {
                    deque.addFirst(left - right);
                }

            } else {
                deque.addFirst(Integer.valueOf(s));
            }
        }
        return deque.peekFirst();
    }
    public static void main(String[] args){
        String[] stringList = new String[]{"2","1","+","3","*"};
        int[] nums2 = new int[]{2,4,1,1,3};
        String text = "abbccaa";
        int val = 12;
        int ladders = 1;
        int result =  evalRPN(stringList);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }

}
