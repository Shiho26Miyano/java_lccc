package com.company;

import java.util.Arrays;
import java.util.Stack;

public class lc_344_Reverse_String {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }



    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        char[] t = new char[]{'h','e','l','l','o'};
        reverseString(t);
        System.out.println(t);
    }


}
