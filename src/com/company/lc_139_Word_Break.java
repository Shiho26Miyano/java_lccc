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
        for (int end = 1; end <= n; end++){
            for (int start = 0; start < end; start++){

                if (end - start > maxLen){
                    continue;
                }

                if (dp[start] && wordDict.contains(s.substring(start, end))){
                    dp[end] = true;
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(dp));
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
