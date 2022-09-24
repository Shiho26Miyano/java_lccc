package com.company;
import java.util.*;
//Since we are only interested in the longest valid substring, our sliding windows need not shrink, even if a window may cover an invalid substring. We either grow the window by appending one char on the right, or shift the whole window to the right by one.
//we only grow the window when the count of the new char exceeds the historical max count (from a previous window that covers a valid substring).

//That is, we do not need the accurate max count of the current window; we only care if the max count exceeds the //historical max count; and that can only happen because of the new char.
public class lc_424_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {
        //To record current max repeated counts of character
        int maxRepeat = 0;
        int start = 0;
        int longest = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for(int end = 0; end < s.length(); end++){
            char right = s.charAt(end);
            charMap.put(right, charMap.getOrDefault(right, 0) + 1);
            //Update the maxRepeat counts
            maxRepeat = Math.max(maxRepeat, charMap.get(right));
            while (end - start + 1 - maxRepeat > k){
                char left = s.charAt(start);
                charMap.put(left, charMap.get(left) - 1);
                if(charMap.get(left) == 0){
                    charMap.remove(left);
                }
                start++;
            }
            //Update the longest substring
            longest = Math.max(longest, end - start + 1);
        }
        return longest;

    }
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 3, 5, 6, 7};
        int target = 6;
        String s = "ABAB";
        int result = characterReplacement(s, 2);
        System.out.println(result);
    }
}