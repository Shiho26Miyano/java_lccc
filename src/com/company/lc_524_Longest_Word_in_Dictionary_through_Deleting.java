package com.company;
import java.util.*;

public class lc_524_Longest_Word_in_Dictionary_through_Deleting {
    public String findLongestWord(String s, List<String> dictionary) {
        // entire dictWord should be found in s
        String longest = "";
        for (String dictWord : dictionary){
            int i = 0;
            for (char c : s.toCharArray()){
                if (i < dictWord.length() && c == dictWord.charAt(i)){
                    i++;
                }
            }
            if (i == dictWord.length() && dictWord.length() >= longest.length()){
                if (dictWord.length() > longest.length() || dictWord.compareTo(longest) < 0 ){
                    longest = dictWord;
                }
            }
        }
        return longest;

    }
}
