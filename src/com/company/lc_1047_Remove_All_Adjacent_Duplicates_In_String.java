package com.company;
import java.util.*;

public class lc_1047_Remove_All_Adjacent_Duplicates_In_String {
    public static String removeDuplicates(String S) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty() || chars[stack.peek()] != chars[i]) {
                stack.push(i);
            } else {
                chars[i] = '-';
                chars[stack.pop()] = '-';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != '-') {
                sb.append(c);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args){
        String s = "addccggazfeezddh";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        String result =  removeDuplicates(s);
        System.out.println(result);
    }


}
