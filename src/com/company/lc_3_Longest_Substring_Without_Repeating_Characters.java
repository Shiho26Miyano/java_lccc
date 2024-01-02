package com.company;
import java.util.*;

public class lc_3_Longest_Substring_Without_Repeating_Characters {
    // method 1, put {end: count} before cleaning, then update
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;
        int longest = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int endIndex = 0; endIndex < s.length(); endIndex++){
            char end = s.charAt(endIndex);

            map.put(end, map.getOrDefault(end, 0) + 1);
            while(map.get(end) > 1){
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
    // method 2: first cleaning, then put {end: count} in map
    public static int lengthOfLongestSubstring2(String s) {
        int startIndex = 0;
        int longest = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++){
            char end = s.charAt(endIndex);


            while(map.containsKey(end)){
                char start = s.charAt(startIndex);
                map.put(start, map.getOrDefault(start, 0) - 1);
                if(map.get(start) == 0){
                    map.remove(start);
                }
                startIndex++;
            }
            map.put(end, map.getOrDefault(end, 0) + 1);
            longest = Math.max(longest, endIndex - startIndex + 1);
        }
        return longest;
    }


    public static void main(String[] args){
        String x = "abcabcbb";
        int result = lengthOfLongestSubstring(x);
        System.out.println(result);

    }

}
