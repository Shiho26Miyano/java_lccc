package com.company;
import java.util.*;
public class lc_918_Maximum_Sum_Circular_Subarray {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, maxSum = nums[0], curSumMax = 0, minSum = nums[0], curSumMin = 0;
        for (int n : nums){
            curSumMax = Math.max(curSumMax + n, n);
            maxSum = Math.max(curSumMax, maxSum);
            curSumMin = Math.min(curSumMin + n, n);
            minSum = Math.min(curSumMin, minSum);
            total += n;
        }
        return maxSum > 0 ? Math.max(maxSum, total -  minSum) : maxSum;
    }
}
