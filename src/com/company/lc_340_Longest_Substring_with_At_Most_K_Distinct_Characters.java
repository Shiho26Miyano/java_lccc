package com.company;
import java.util.*;

public class lc_340_Longest_Substring_with_At_Most_K_Distinct_Characters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int startIndex = 0;
        int mostChar = 0;


        Map<Character, Integer> map = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++){
            char end = s.charAt(endIndex);

            map.put(end, map.getOrDefault(end, 0) + 1);

            while(map.size() > k){
                char start = s.charAt(startIndex);
                map.put(start, map.getOrDefault(start, 0) - 1);
                if (map.get(start) == 0){
                    map.remove(start);
                }
                startIndex++;
            }
            mostChar = Math.max(mostChar, endIndex - startIndex + 1);
        }
        return mostChar;
    }
}
