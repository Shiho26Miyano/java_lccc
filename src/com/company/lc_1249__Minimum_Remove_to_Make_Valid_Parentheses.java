package com.company;
import java.util.*;
public class lc_1249__Minimum_Remove_to_Make_Valid_Parentheses {
    public static String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexesToRemove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        // Put any indexes remaining on stack into the set.
        while (!stack.isEmpty()) indexesToRemove.add(stack.pop());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }



    public static void main(String[] args){
        String s = "lee(t(c)o)de)";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        String result =   minRemoveToMakeValid(s);
        System.out.println(result);
    }


}
