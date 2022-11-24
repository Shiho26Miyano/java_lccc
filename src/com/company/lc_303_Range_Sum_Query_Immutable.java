package com.company;
import java.util.*;
public class lc_303_Range_Sum_Query_Immutable {
    int[] nums;
    public void NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
            this.nums = nums;
        }
    }
    public int sumRange(int left, int right) {
        if (left == 0) return nums[right];
        return nums[right] - nums[left - 1];

    }
}
