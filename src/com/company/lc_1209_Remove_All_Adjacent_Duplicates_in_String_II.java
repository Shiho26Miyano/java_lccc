package com.company;
import java.util.*;


public class lc_1209_Remove_All_Adjacent_Duplicates_in_String_II {

    public static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> counts = new Stack<>();
        for (int i = 0; i < sb.length(); ++i) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                counts.push(1);
            } else {
                int incremented = counts.pop() + 1;
                if (incremented == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                } else {
                    counts.push(incremented);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "deeedbbcccbdaa";
        //int[] nums2 = new int[]{2,2,3};
        int k = 3;
        String result = removeDuplicates(s, k);
        System.out.println(result);
    }





}
