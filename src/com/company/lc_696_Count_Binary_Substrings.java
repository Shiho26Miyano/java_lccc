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
    public static void main(String[] args){
        String x = "00110011";
        System.out.println(countBinarySubstrings(x));


    }

}
