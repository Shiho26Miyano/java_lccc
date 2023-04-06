package com.company;

public class lc_1480_Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        // modify the input array, adding n[i] with n[i-1]
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        // return the modified array
        return nums;
    }
}

