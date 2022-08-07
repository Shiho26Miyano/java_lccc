package com.company;
import java.util.*;

public class lc_389_FindtheDifference {
    public static char findTheDifference(String s, String t) {
        char extraC = '\0';
        Map<Character, Integer> sCounter = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            sCounter.put(sChar, sCounter.getOrDefault(sChar, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char tChar = t.charAt(i);
            int tCharCheck = sCounter.getOrDefault(tChar, 0);
            if (tCharCheck == 0) extraC = tChar;
            sCounter.put(tChar, sCounter.getOrDefault(tChar, 0) - 1);

        }

        return extraC;
    }
    public  static int findTheDifference2(String s, String t) {
        int sSum = 0;
        //ASCI value
        int tSum = t.charAt(t.length() - 1);
        System.out.println(tSum);
        for(int i = 0; i < s.length() ; i++){
            sSum += s.charAt(i);

            tSum += t.charAt(i);
        }
        System.out.println(sSum);
        System.out.println(tSum);

        return (int)(tSum - sSum);
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,2,2,3,1};
        int target = 5;
        String str1 = "abcda";
        String str2 = "abcdab";
        char result =  findTheDifference(str1, str2);
        System.out.println((result));
    }
}
