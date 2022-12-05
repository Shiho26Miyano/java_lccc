package com.company;
import java.util.HashMap; // import the HashMap class
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class lc_696_Count_Binary_Substrings {
    public static int countBinarySubstrings(String s) {
        if (s==null || s.length()<=1){
            return 0;
        }
        int res = 0;
        int preCnt = 0, curCnt = 1;
        char[] crs = s.toCharArray();
        for (int i = 1; i < crs.length; i++){
            if (crs[i]==crs[i-1]){
                curCnt++;
            }else{
                preCnt = curCnt;
                curCnt = 1;
            }
            if(preCnt>=curCnt) res++;
        }
        return res;
    }
//First, I count the number of 1 or 0 grouped consecutively.
//For example "0110001111" will be [1, 2, 3, 4].
//Second, for any possible substrings with 1 and 0 grouped consecutively, the number of valid substring will //be the minimum number of 0 and 1.
//For example "0001111", will be min(3, 4) = 3, ("01", "0011", "000111")
    public static int countBinarySubstrings2(String s) {
        int cur = 1, pre = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }


    public static void main(String[] args){
        String x = "00110011";
        System.out.println(countBinarySubstrings(x));


    }

}
