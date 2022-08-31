package com.company;
import java.util.*;


public class lc_917_Reverse_Only_Letters {
    public static String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack<>();
        for (char c : s.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: s.toCharArray())
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        return ans.toString();
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{3,1,2,4};
        int[] nums2 = new int[]{1,3,4,2};
        String text = "ab-cd";
        int val = 2;
        int ladders = 1;
        String result = reverseOnlyLetters(text);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }
}
