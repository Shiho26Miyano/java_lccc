package com.company;
import java.util.*;

public class lc_992_Subarrays_with_K_Different_Integers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);


    }

    public int helper(int[] nums, int k) {
        int startIndex = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int endIndex = 0; endIndex < nums.length; endIndex++){


            int end = nums[endIndex];

            map.put(end, map.getOrDefault(end, 0) + 1);

            while (map.size() > k) {
                int start = nums[startIndex];
                map.put(start, map.getOrDefault(start, 0) - 1);
                if (map.get(start) == 0){
                    map.remove(start);
                }
                startIndex++;

            }
            count += endIndex - startIndex + 1;


        }
        return count  ;


    }
}
