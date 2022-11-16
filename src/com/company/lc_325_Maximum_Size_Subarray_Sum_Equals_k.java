package com.company;
import java.util.*;

public class lc_325_Maximum_Size_Subarray_Sum_Equals_k {
    public int maxSubArrayLen1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0, sum = 0;
        // incase of sum-k = 0, we'd better have put(0,-1) in map so that current index - (-1) is the correct size of the subarray that sums up to k.
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum - k)) result = Math.max(i - map.get(sum - k), result);
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return result;
    }
    public int maxSubArrayLen2(int[] nums, int k) {
        int sum = 0;
        int maxLength = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int complement = sum - k;
            if (complement == 0) {
                maxLength = i + 1;  // the whole subarray up to the current index totals to `k`.
            } else if (prefixSums.containsKey(complement)) {
                maxLength = Math.max(maxLength, i - prefixSums.get(complement));
            }

            prefixSums.putIfAbsent(sum, i);
        }
        return maxLength;
    }
}
