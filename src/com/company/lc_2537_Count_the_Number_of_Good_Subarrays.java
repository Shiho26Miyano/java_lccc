package com.company;
import java.util.*;
public class lc_2537_Count_the_Number_of_Good_Subarrays {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int start = 0;
        long ans = 0;
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            count += map.getOrDefault(nums[i], 0) - 1;
            while (count >= k) {
                ans+= nums.length - i;

                count -= map.get(nums[start]) - 1;

                map.put(nums[start], map.get(nums[start]) - 1);
                start++;
            }
        }
        return ans;
    }
}
