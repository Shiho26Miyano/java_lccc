package com.company;
import java.util.*;


public class lc_523_Continuous_Subarray_Sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            // Case 1: If sum from 0 to i is divisible by k and size of subarray is at least 2 return true
            if (sum % k == 0 && i > 0)
                return true;

            // Case 2: If map has remainder and size of subarray is at least 2 return true
            if (map.containsKey(sum % k) && i - map.get(sum % k) >= 2)
                return true;

            // We are not inserting the remainder if it already exists to ensure that we have the maximum difference of indexes as i's value will be smaller
            if (!map.containsKey(sum % k))
                map.put(sum % k, i);
        }

        return false;
    }

}
