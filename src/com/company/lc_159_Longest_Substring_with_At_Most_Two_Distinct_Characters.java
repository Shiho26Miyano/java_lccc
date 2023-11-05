package com.company;
import java.util.*;

public class lc_159_Longest_Substring_with_At_Most_Two_Distinct_Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        //solution
        //1.创建{char: #} mapping, startIndex = 0, largestLen = 0
        //2.startIndex = 0 use end loop through s.length(),
        // while map.size() > 2, startIndex 不断左移动，直到map.size() == 2
        // 再继续end右移
        //3.记住largestLen 一定要把数据清理成功在map.size() = 2时候再进行比较和储存，
        //若在size > 2之前储存，那最后一个char若是unique 3nd value,就会错误加到largestLen

        Map<Character, Integer> map = new HashMap<>();
        int startIndex = 0;
        int largestLen = 0;
        for (int i = 0; i < s.length(); i++){
            char end = s.charAt(i);
            map.put(end, map.getOrDefault(end, 0) + 1);

            while (map.size() > 2){
                char start = s.charAt(startIndex);
                map.put(start, map.getOrDefault(start, 0) - 1);
                if (map.get(start) == 0){
                    map.remove(start);
                }
                startIndex++;
            }
            largestLen = Math.max(largestLen, i - startIndex + 1);

        }
        return largestLen;
    }
}
