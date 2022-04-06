package com.company;
import java.util.*;

public class lc_128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longest = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int length = 0;
                while (num_set.contains(length + num)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,8,6,2,5,4,8,3,7};
        int target = 9;
        int result = longestConsecutive(intArray);
        System.out.println((result));
    }
}

