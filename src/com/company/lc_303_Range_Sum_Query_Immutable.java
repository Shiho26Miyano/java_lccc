package com.company;
import java.util.*;
public class lc_303_Range_Sum_Query_Immutable {

    int[] nums;

    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            // count accumulcated nums[i]
            nums[i] += nums[i - 1];

        this.nums = nums;
        System.out.println(Arrays.toString(nums));
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return nums[j];

        return nums[j] - nums[i - 1];
    }
}
