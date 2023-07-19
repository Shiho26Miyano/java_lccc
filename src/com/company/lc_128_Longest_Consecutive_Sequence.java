package com.company;
import java.util.*;

public class lc_128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longestStreak = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                longestStreak = Math.max(longestStreak, currStreak);
            }
        }

        return longestStreak;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,8,6,2,5,4,8,3,7};
        int target = 9;
        int result = longestConsecutive(intArray);
        System.out.println((result));
    }
}

