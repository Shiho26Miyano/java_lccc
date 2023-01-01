package com.company;
import java.util.*;
public class lc_1048_Longest_String_Chain {
    //https://leetcode.com/problems/longest-string-chain/solutions/294890/java-c-python-dp-solution/?orderBy=most_votes
    //Sort the words by word's length. (also can apply bucket sort)
    //For each word, loop on all possible previous word with 1 letter missing.
    //If we have seen this previous word, add the current word to the longest chain for the current word.
    //Finally return the longest word chain
    // substring: public String substring(int begIndex, inclusive); public String substring(int begIndex inclusive, int endIndex exclusive)
    //  We store this result in a map where key is the word and value is the sequence length. By doing this we ensure that, for each word that we encounter, we already know the result of all of its possible predecessors.
    public int longestStrChain(String[] words) {
        Map<String, Integer>map = new HashMap<>();
        Arrays.sort(words, (a, b)->a.length() - b.length());
        int res = 0;
        for (String word: words){
            int maxFreq = 0;
            for (int i = 0; i < word.length(); i++){
                String misCharWord = word.substring(0, i) + word.substring(i + 1);
                //calculate how many times the word with 1 missing char appears in the mapping list.
                int freq = map.getOrDefault(misCharWord, 0) + 1;
                // in each word, find higest freq that missing 1 char word appear most
                maxFreq = Math.max(maxFreq, freq);

            }
            // put each word with its highest freq in the map
            map.put(word, maxFreq);
            // get the highest freq in the mapping
            res = Math.max(res, maxFreq);
        }
        return res;

    }
}








