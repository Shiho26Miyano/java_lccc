package com.company;
import java.util.*;


public class lc_1358_Number_of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        int count[] = {0, 0, 0}, best = 0 , l = 0;
        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                count[s.charAt(l++) - 'a']--;
            best += l;
        }
        return best;
    }
}
