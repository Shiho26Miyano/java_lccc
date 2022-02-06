package com.company;
import java.util.*;
public class lc_1249__Minimum_Remove_to_Make_Valid_Parentheses {
    public static String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
                //System.out.println(Arrays.toString(stack.toArray()));
            } if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexesToRemove.add(i);
                   // System.out.println(Arrays.toString(indexesToRemove.toArray()));
                } else {
                    stack.pop();
                }
            }
        }
        // Put any indexes remaining on stack into the set.
        System.out.println(stack);
        System.out.println(Arrays.toString(stack.toArray()));
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
        String s = ")lee(t(c)o)de)(((";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        String result =   minRemoveToMakeValid(s);
        System.out.println(result);
    }


}

//1. 组成剩余（的stack，组成生育）的hashset2. 把剩余( 的stack加到剩余）的hashset3.把剩余大军团和s相对比index不在大军团里面的重新组成string builder，就是结果。