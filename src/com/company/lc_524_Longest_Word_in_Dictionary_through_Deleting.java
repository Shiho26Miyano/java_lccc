package com.company;
import java.util.*;

public class lc_524_Longest_Word_in_Dictionary_through_Deleting {
    public String findLongestWord(String s, List<String> dictionary) {
        String longest = "";
        for (String dictword: dictionary){
            int i = 0;
            for (char c : s.toCharArray()){
                if (i < dictword.length() && c == dictword.charAt(i)){
                    i++;
                }
            }
            if (i == dictword.length() && dictword.length() >= longest.length()){
                if (dictword.length() > longest.length() || dictword.compareTo(longest) < 0){
                    longest = dictword;
                }
            }

        }

        return longest;
    }
}
