package com.company;

public class lc_209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (right < nums.length) {
            sum += nums[right];

            //As soon as we get sum greater than or equal to target, we can take the length of the
            //contiguous subarray, and update min accordingly. For further iterations, we have to
            //move left and remove nums[left], so we subtract nums[left] from sum and increase left
            //and continue till sum is greater than or equal to target.
            while (sum >= target) {
                int len = right - left + 1;
                min = Math.min(min, len);
                sum = sum - nums[left];
                left++;
            }

            right++;
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
