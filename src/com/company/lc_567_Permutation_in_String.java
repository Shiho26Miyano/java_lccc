package com.company;
import java.util.*;
//The goal is count the occurrences of each character.
// c - 'a'
//is a kind of clever way to get the position of the character in the alphabet. 'a' - 'a' would give you 0.
//'b' - 'a' would give you 1. 'c' - 'a' would give you 2, and so on.
public class lc_567_Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(arr1, arr2)) return true;

        int front = 0;
        int back = s1.length();
        while(back < s2.length()){
            arr2[s2.charAt(front) - 'a']--;
            arr2[s2.charAt(back) - 'a']++;

            if(Arrays.equals(arr1, arr2)) return true;
            front++;
            back++;
        }
        return false;
    }

    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
}
