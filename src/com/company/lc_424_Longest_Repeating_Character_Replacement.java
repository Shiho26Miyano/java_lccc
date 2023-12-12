package com.company;
import java.util.*;
//Since we are only interested in the longest valid substring, our sliding windows need not shrink, even if a window may cover an invalid substring. We either grow the window by appending one char on the right, or shift the whole window to the right by one.
//we only grow the window when the count of the new char exceeds the historical max count (from a previous window that covers a valid substring).
//That is, we do not need the accurate max count of the current window; we only care if the max count exceeds the //historical max count; and that can only happen because of the new char.
public class lc_424_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {
        int maxRepeat = 0;
        int startIndex = 0;
        int longest = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int endIndex = 0; endIndex < s.length(); endIndex++){
            char end = s.charAt(endIndex);
            map.put(end, map.getOrDefault(end, 0) + 1);
            maxRepeat = Math.max(maxRepeat, map.get(end));
            while(endIndex - startIndex + 1 - maxRepeat > k){
                char start = s.charAt(startIndex);
                map.put(start, map.getOrDefault(start, 0) - 1);
                if (map.get(start) == 0){
                    map.remove(start);
                }
                startIndex++;
            }
            longest = Math.max(longest, endIndex - startIndex + 1);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 3, 5, 6, 7};
        int target = 6;
        String s = "ABAB";
        int result = characterReplacement(s, 2);
        System.out.println(result);
        // test out
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result2 = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + result2);
    }
    //chatgpt sliding window example
    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE; // Initialize the maximum sum with the smallest possible integer
        int currentSum = 0; // Initialize the current sum

        // Initialize the sliding window
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        // Slide the window through the array
        for (int i = k; i < arr.length; i++) {
            // Update the maximum sum if the current sum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // Add the next element to the current sum and remove the first element in the window
            currentSum += arr[i] - arr[i - k];
        }

        // Check one more time after the loop ends in case the maximum sum ends at the last subarray
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }

        return maxSum;
    }


}