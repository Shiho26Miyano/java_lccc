package com.company;
import java.util.*;

public class lc_387_first_unique_chracter_in_a_string {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        System.out.println(count);
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        String s = "ccccccddddatfdsafffff";

        int result = firstUniqChar(s);
        System.out.println(result);
    }
}
