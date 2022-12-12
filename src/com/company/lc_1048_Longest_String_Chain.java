package com.company;
import java.util.*;
public class lc_1048_Longest_String_Chain {
    //https://leetcode.com/problems/longest-string-chain/solutions/294890/java-c-python-dp-solution/?orderBy=most_votes
    //Sort the words by word's length. (also can apply bucket sort)
    //For each word, loop on all possible previous word with 1 letter missing.
    //If we have seen this previous word, add the current word to the longest chain for the current word.
    //Finally return the longest word chain
    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a, b)->a.length() - b.length());
        int res = 0;
        for (String word: words){
            int best = 0 ;
            for (int i = 0; i < word.length(); i++){
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;

    }
}




