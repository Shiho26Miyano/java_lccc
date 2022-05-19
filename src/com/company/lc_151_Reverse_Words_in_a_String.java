package com.company;
import java.util.*;

public class lc_151_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        // remove leading spaces
        s = s.trim();
        // split by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        int m = 3;
        int n = 7;
        String s = "the sky is blueeee";
        //int target =5;
        String result = reverseWords(s);
        System.out.println(result);
    }
}






