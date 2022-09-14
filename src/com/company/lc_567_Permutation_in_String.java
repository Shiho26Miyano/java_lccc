package com.company;
import java.util.*;

public class lc_567_Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        //The goal is count the occurrences of each character.
        // c - 'a'
        //is a kind of clever way to get the position of the character in the alphabet. 'a' - 'a' would give you 0.
        //'b' - 'a' would give you 1. 'c' - 'a' would give you 2, and so on.
        if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(s1map));
            s2map[s2.charAt(i) - 'a']++;
        }
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
