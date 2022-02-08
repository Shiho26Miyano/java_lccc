package com.company;
import java.util.*;

public class lc_921_Minimum_Add_to_Make_Parentheses_Valid {

    public static int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) count++;
                else stack.pop();
            }
        }
        return count + stack.size();
    }



    public static void main(String[] args){
        String s = ")())))))(";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int result = minAddToMakeValid(s);
        System.out.println(result);
    }


}
