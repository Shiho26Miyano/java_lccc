package com.company;

public class lc_485_Max_Consecutive_One {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                // Increment the count of 1's by one.
                count += 1;
            } else {
                // Find the maximum till now.
                maxCount = Math.max(maxCount, count);
                // Reset count of 1.
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,1,0,1,1,1};
        int target = 2;
        String s = "tree";
        int result = findMaxConsecutiveOnes(intArray);
        System.out.println(result);
    }
}
