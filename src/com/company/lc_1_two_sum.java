package com.company;
import java.util.*;
public class lc_1_two_sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null; // In case there is no solution, we will just return null
    }

    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        int target = 5;
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
    }
}
