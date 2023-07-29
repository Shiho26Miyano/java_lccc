package com.company;
import java.util.*;

public class lc_128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //SortedSet add() method
        for (int n : nums) set.add(n);
        int totalMaxLen = 0;
        for (int setItem : set){

            //loop through the sorted set, if set not contains previous element,
            //start from this current element, currMaxLen is 1
            //from current element, count how many currNum++ be found in set.
            //HashSet is not ordered, TreeSet is ordered, HashSet is faster than TreeSet.
            if (!set.contains(setItem - 1)){
                int currNum = setItem;
                int currMaxLen = 1;

                while (set.contains(currNum + 1)){
                    currNum++;
                    currMaxLen++;
                }
                totalMaxLen = Math.max(totalMaxLen, currMaxLen);
            }
        }
        return totalMaxLen;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,8,6,2,5,4,8,3,7};
        int target = 9;
        int result = longestConsecutive(intArray);
        System.out.println((result));
    }
}

