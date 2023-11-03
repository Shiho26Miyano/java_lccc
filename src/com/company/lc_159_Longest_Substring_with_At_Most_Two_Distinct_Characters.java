package com.company;
import java.util.*;

public class lc_159_Longest_Substring_with_At_Most_Two_Distinct_Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int startIx = 0;
        int bestSubLen = 0;
        for (int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > 2){
                char startChar = s.charAt(startIx);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0){
                    map.remove(startChar);
                }
                startIx++;
            }
            bestSubLen = Math.max(bestSubLen, i - startIx + 1);
        }
        return bestSubLen;
    }
}
