package com.company;

public class lc_53_Maximum_Subarray {


    public static int maxSubArray(int[] nums) {
        int subSum = nums[0]; // this sum used to decided whether bring old variables sum is necesary(if pre sum < 0 then varialbe as a new starter)
        int maxSum = nums[0];// this sum is the real max sum subarray
        for (int i = 1; i < nums.length; i ++) {
            subSum = Math.max(subSum + nums[i], nums[i]);
            maxSum = Math.max(subSum, maxSum);
        }
        return maxSum;


    }


    public static void main(String[] args){
        int[] nums1 = new int[]{-300,2,-200, 250};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int result = maxSubArray(nums1);
        System.out.println(result);
    }


}
