package com.company;
import java.util.*;

public class lc_821_Shortest_Distance_to_a_Character {
    public static int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{-4,-1,0,3,10};
        String s = "loveleetcode";
        char p = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, p)));
    }
}
