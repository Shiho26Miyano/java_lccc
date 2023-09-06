package com.company;
import java.util.*;
public class lc_266_Palindrome_Permutation {
    public static boolean canPermutePalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int[] chars = new int[128];
        for (char c : s.toCharArray()) {
            chars[(int) c]++;
        }

        int count = 0;
        for (int i : chars) {
            count += i % 2;
        }
        return count <= 1;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,3,2};
        int target = 5;
        String s = "aab";
        boolean result = canPermutePalindrome(s);
        System.out.println(result);
    }
}


