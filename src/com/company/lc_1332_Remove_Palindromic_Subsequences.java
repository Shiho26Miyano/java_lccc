package com.company;
import java.util.*;
public class lc_1332_Remove_Palindromic_Subsequences {
    public static int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (isPalindrome(s)) {
            return 1;
        }
        return 2;
    }

    private static boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{-4,-1,0,3,10};
        String s = "ababa";
        String p = "abc";
        System.out.println(removePalindromeSub(s));
    }
}
