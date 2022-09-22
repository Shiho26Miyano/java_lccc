package com.company;
import java.util.*;

public class lc_159_Longest_Substring_with_At_Most_Two_Distinct_Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        // [character, number of repetiotion]
        Map<Character, Integer> map = new HashMap();

        int start = 0; // start of the window
        int end = 0; // end of the window
        int max = 0;

        while(end < s.length()) {
            if(map.size() <= 2) {
                // add new charater from the end pointer
                Character newChar = s.charAt(end);
                map.put(newChar, map.getOrDefault(newChar, 0) + 1); // increase the counter if we face this character

                // increase the size of window
                end++;
            } else {
                // decrease the size of the window as far as we've reached the number of distinct characters at most two
                // remove start character
                Character charToRemove = s.charAt(start);

                int counter = map.get(charToRemove) - 1;
                if(counter < 1) {
                    // there are no such characters in a row. Let's delete the character from the map
                    map.remove(charToRemove);
                } else {
                    // update counter
                    map.put(charToRemove, counter);
                }
                start++;
            }

            // if we stil in the right amount of distinct characters calculate maximus
            if(map.size() <= 2) {
                max = Math.max(max, (end - start) + 0);
            }
        }

        return max;
    }
}
