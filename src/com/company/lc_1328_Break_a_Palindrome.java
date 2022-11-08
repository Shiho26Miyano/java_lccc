package com.company;
import java.util.*;
public class lc_1328_Break_a_Palindrome {
    public String breakPalindrome(String palindrome) {
        //Use single quotes for literal chars, double quotes for literal Strings,
        char[] s = palindrome.toCharArray();
        int n = s.length;

        for (int i = 0; i < n / 2; i++) {
            if (s[i] != 'a') {
                s[i] = 'a';
                return String.valueOf(s);
            }
        }
        s[n - 1] = 'b'; //if all 'a'
        return n < 2 ? "" : String.valueOf(s);
    }
}
