package com.company;
import java.util.*;

public class lc_916_Word_Subsets {
    //For each word b in B,
    //we use function counter to count occurrence of each letter.
    //We take the maximum occurrences of counts, and use it as a filter of A.
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] countMap = new int[26], tmp;
        int i ;

        for (String word: words2){
            tmp = counter(word);
            // 创建mapping list把所有word打散算出所有的frequency
            for (i = 0; i < 26; i++){
                countMap[i] = Math.max(countMap[i], tmp[i]);
            }
        }
        List<String> ans = new ArrayList<>();

        for (String word: words1){
            tmp = counter(word);
            //filter每一个词character的frequency是否大于等于mapping list；如果小于那就不要了
            for (i = 0; i < 26; i++){
                if (tmp[i] < countMap[i]) break;
            }
            if (i > 25) ans.add(word);
        }
        return ans;

    }


    int[] counter(String word){
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;

    }
}
