package com.company;
import java.util.*;

public class lc_916_Word_Subsets {
    //For each word b in B,
    //we use function counter to count occurrence of each letter.
    //We take the maximum occurrences of counts, and use it as a filter of A.
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] count = new int[26], tmp;
        int i;
        for (String word: words2){
            tmp = counter(word);
            for (i = 0; i < 26; i++){
                count[i] = Math.max(count[i], tmp[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (String word: words1){
            tmp = counter(word);
            for(i = 0; i < 26; i++){
                if (tmp[i] < count[i])
                    break;
            }
            if(i == 26) res.add(word);

        }
        return res;

    }

    int[] counter(String word){
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;
    }
}
