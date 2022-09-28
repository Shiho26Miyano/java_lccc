package com.company;
import java.util.*;


public class lc_1234_Replace_the_Substring_for_Balanced_String {
    public int balancedString(String s) {
        int[] count = new int[128];
        int n = s.length(), k = n / 4, l = 0, best = n;

        for (int r = 0; r < n; r++){
            count[s.charAt(r)]++;
        }

        for (int r = 0; r < n; r++){
            count[s.charAt(r)]--;
            while (l < n && count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
                best = Math.min(best, r - l + 1);
                ++count[s.charAt(l++)];
            }

        }
        return best;

    }
}
