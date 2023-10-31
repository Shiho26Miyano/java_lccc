package com.company;

public class lc_209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];
            while (sum >= target) {
                minLength = end - start + 1 < minLength ? end - start + 1 : minLength;
                sum = sum - nums[start];
                start++;
            }

        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;


    }
}