package com.company;
import java.util.*;
public class lc_424_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k){
        int[] count = new int[128];
        int max=0;
        int start=0;
        for(int end=0; end<s.length(); end++)
        {
            max = Math.max(max, ++count[s.charAt(end)]);
            if(max+k<=end-start)
                count[s.charAt(start++)]--;
        }
        return s.length()-start;
    }
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 3, 5, 6, 7};
        int target = 6;
        String s = "ABAB";
        int result = characterReplacement(s, 2);
        System.out.println(result);
    }
}
