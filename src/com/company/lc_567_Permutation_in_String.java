package com.company;
import java.util.*;
//The goal is count the occurrences of each character.
// c - 'a'
//is a kind of clever way to get the position of the character in the alphabet. 'a' - 'a' would give you 0.
//'b' - 'a' would give you 1. 'c' - 'a' would give you 2, and so on.
public class lc_567_Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        // purpose: find substring of s2 has s1, regardless of the order
        // 1. sum of all array list for s1map and s2map should be the same
        // 2. check on s2 whether there is consistent pattern same with s1 no matter of the postiion
        if (s1.length() > s2.length())
            return false;
        // create the empty int list with 26 positions
        int[] s1map = new int[26];
        int[] s2map = new int[26];

        //fill each position with count # of each s1 char to s1map and s2map
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(s1map));
        System.out.println(Arrays.toString(s2map));
        // find the correct pattern!for the char in s2 after s1.length(), fill in the good ones, remove the bad ones.
        // add on (s2.charAt(i + s1.length())) remove s2.charAt(i)
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1map, s2map))
                return true;
            s2map[s2.charAt(i + s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }
        return matches(s1map, s2map);
    }

    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
}
