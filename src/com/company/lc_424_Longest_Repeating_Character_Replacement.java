package com.company;
import java.util.*;
//Since we are only interested in the longest valid substring, our sliding windows need not shrink, even if a window may cover an invalid substring. We either grow the window by appending one char on the right, or shift the whole window to the right by one.
//we only grow the window when the count of the new char exceeds the historical max count (from a previous window that covers a valid substring).

//That is, we do not need the accurate max count of the current window; we only care if the max count exceeds the //historical max count; and that can only happen because of the new char.
public class lc_424_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {

        int length = s.length();

        if (length == 0) {
            return 0;
        }

        int[] charToCountMap = new int[26];
        int end = 0;
        int start = 0;
        int maxCount = 0;

        while (end < length) {
            // Increase the count of the alphabet encountered at i
            int count = ++charToCountMap[s.charAt(end)-'A'];

            // If the count of this alphabet is greater than the maxCount, then update
            // otherwise remove this alphabet
            if (count > maxCount) {
                maxCount = count;
            } else {
                k--;
            }

            // shorten the window by increasing j
            // also reduce the count of alphabet at j
            if (k < 0) {
                --charToCountMap[s.charAt(start)-'A'];
                k++;
                start++;
            }

            end++;
        }

        return end-start;
    }
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 3, 5, 6, 7};
        int target = 6;
        String s = "ABAB";
        int result = characterReplacement(s, 2);
        System.out.println(result);
    }
}
