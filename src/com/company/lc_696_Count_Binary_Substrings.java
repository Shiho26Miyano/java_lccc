package com.company;
import java.util.HashMap; // import the HashMap class
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class lc_696_Count_Binary_Substrings {


    public static int countBinarySubstrings(String s) {
        int ans = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return ans + Math.min(prev, cur);
    }
    public static void main(String[] args){
        String x = "00110011";
        System.out.println(countBinarySubstrings(x));

    }

}
