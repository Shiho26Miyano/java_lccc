package com.company;
import java.util.*;
public class lc_242_valid_anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


    public static void main(String[] args){
        String s = "cat";
        String t = "act";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

}
