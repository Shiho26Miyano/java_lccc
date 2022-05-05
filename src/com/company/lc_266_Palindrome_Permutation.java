package com.company;
import java.util.*;

public class lc_266_Palindrome_Permutation {
    public static boolean canPermutePalindrome(String s) {
        HashMap < Character, Integer > map = new HashMap < > ();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }
        return count <= 1;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        int target = 5;
        String s = "code";
        boolean result = canPermutePalindrome(s);
        System.out.println(result);
    }
}
