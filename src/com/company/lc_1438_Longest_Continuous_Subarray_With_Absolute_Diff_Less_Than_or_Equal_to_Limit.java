package com.company;
import java.util.*;

public class lc_1438_Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit {
    public int longestSubarray(int[] nums, int limit) {
        // sort by nums[a] - nuns[b]!!! not sort by index
        int left = 0;
        TreeSet<Integer> set = new TreeSet<>((a, b) -> nums[a] == nums[b] ? a - b : nums[a] - nums[b]);

        set.add(0);
        int res = 1;

        for (int right = 1; right < nums.length; right++){
            set.add(right);
            while(nums[set.last()] - nums[set.first()] > limit){
                set.remove(left++);
            }
            res = Math.max(res, right - left + 1);
        }
        return res;

    }
}
