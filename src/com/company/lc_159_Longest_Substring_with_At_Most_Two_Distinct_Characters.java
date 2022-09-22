package com.company;
import java.util.*;

public class lc_159_Longest_Substring_with_At_Most_Two_Distinct_Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int best = 0;
        for(int i = 0; i < s.length(); i++) {
            // character at the right pointer
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            // make sure map size is valid, no need to check left pointer less than s.length()
            while (map.size() > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            best = Math.max(best, i - left + 1);
        }
        return best;
    }
}
