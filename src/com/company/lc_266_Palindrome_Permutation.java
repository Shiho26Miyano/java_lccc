package com.company;
import java.util.*;
public class lc_266_Palindrome_Permutation {
    // solution 1: array
    public static boolean canPermutePalindrome(String s) {
        if(s.length() == 1)
            return true;

        int[] freq = new int[26];

        for(char i : s.toCharArray())
            freq[i-'a']++;

        int count = 0;
        for(int i : freq)
            if(i%2 == 1)
                count++;

        return count <=1 ;
    }
    
    // solution 2: hashmap
    public boolean canPermutePalindrome2(String s) {
        Map<Character, Integer> map = new HashMap();

        for (char c : s.toCharArray()){
            if (map.containsKey(c)) map.remove(c);
            else map.put(c, 1);
        }
        if (map.size() > 1) return false;
        return true;

    }

    public static void main(String[] args){
        int[] intArray = new int[]{2,3,2};
        int target = 5;
        String s = "aab";
        boolean result = canPermutePalindrome(s);
        System.out.println(result);
    }
}


