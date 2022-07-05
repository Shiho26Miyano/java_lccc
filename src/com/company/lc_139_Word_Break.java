package com.company;
import java.util.*;

public class lc_139_Word_Break {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int maxLen = Integer.MIN_VALUE;
        for (String word : wordDict) {
            maxLen = (word.length() > maxLen) ? word.length() : maxLen;
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];

        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if((i - j) > maxLen){
                    continue;
                }
                System.out.println("check here");
                System.out.println(i);
                System.out.println(j);
                System.out.println(s.substring(j, i));


                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }



    public static void main(String[] args){
        int[] intArray = new int[]{1,1,0,1,1,1,0,0,1,1,1,1,1};
        String[] ls = new String[]{"leet", "code"};
        int target = 2;
        String s = "leetcode";
        boolean result = wordBreak(s, Arrays.asList(ls));
        System.out.println(result);
    }

}
