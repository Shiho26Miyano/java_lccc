package com.company;
import java.util.*;

public class lc_942_DI_String_Match {
    public static int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{-4,-1,0,3,10};
        String s = "abab";
        String p = "abc";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }
}
