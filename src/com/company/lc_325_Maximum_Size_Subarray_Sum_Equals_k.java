package com.company;
import java.util.*;

public class lc_325_Maximum_Size_Subarray_Sum_Equals_k {
    public int maxSubArrayLen1(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int result = 0, sum = 0;
        hm.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hm.containsKey(sum - k)) result = Math.max(i - hm.get(sum - k), result);
            if (!hm.containsKey(sum)) hm.put(sum, i);
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
