package com.company;
import java.util.*;

public class lc_697_Degree_of_an_Array {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<>(), right = new HashMap<>(), count = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (left.get(nums[i]) == null) left.put(nums[i], i);
            right.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println((left));
        System.out.println(right);
        System.out.println((count));
        int ans = nums.length;
        int degree = Collections.max(count.values());

        for (int key : count.keySet()){
            if (count. get(key) == degree){
                ans = Math.min(ans, right.get(key) - left.get(key) + 1);
            }
        }
        return ans;

    }

    public static void main(String[] args){
        int[] intArray = new int[]{1,2,2,3,1};
        int target = 5;
        int result = findShortestSubArray(intArray);
        System.out.println((result));
    }
}
