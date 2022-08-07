package com.company;
import java.util.*;

public class lc_389_FindtheDifference {
    public static char findTheDifference(String s, String t) {

        char extraChar = '\0';

        // Prepare a counter for string s.
        // This hash map holds the characters as keys and respective frequency as value.
        HashMap <Character,Integer> counterS = new HashMap <>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counterS.put(ch, counterS.getOrDefault(ch, 0) + 1);
        }

        // Iterate through string t and find the character which is not in s.
        for (int i = 0; i < t.length(); i += 1) {
            char ch = t.charAt(i);
            int countOfChar = counterS.getOrDefault(ch, 0);
            if (countOfChar == 0) {
                extraChar = ch;
                break;
            } else {

                // Once a match is found we reduce frequency left.
                // This eliminates the possibility of a false match later.
                counterS.put(ch, countOfChar - 1);
            }
        }
        return extraChar;
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
        String str1 = "abcd";
        String str2 = "abcde";
        int result =  findTheDifference2(str1, str2);
        System.out.println((result));
    }
}
