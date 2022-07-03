package com.company;
import java.util.*;

public class lc_139_Word_Break {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[s.length()];
        queue.add(0);
        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (visited[start]) {
                continue;
            }
            for (int end = start + 1; end <= s.length(); end++) {
                if (wordDictSet.contains(s.substring(start, end))) {
                    queue.add(end);
                    if (end == s.length()) {
                        return true;
                    }
                }
            }
            visited[start] = true;
        }
        return false;
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
