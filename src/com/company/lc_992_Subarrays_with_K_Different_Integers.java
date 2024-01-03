package com.company;
import java.util.*;

public class lc_992_Subarrays_with_K_Different_Integers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    int atMost(int[] nums, int k){

        int startIndex = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int endIndex = 0; endIndex < nums.length; endIndex++){
            int end = nums[endIndex];
            map.put(end, map.getOrDefault(end, 0) + 1);

            while(map.size() > k){
                int start = nums[startIndex];
                map.put(start, map.getOrDefault(start, 0) - 1);
                if (map.get(start) == 0){
                    map.remove(start);
                }
                startIndex++;
            }
            res += endIndex - startIndex + 1;


        }
        return res;

    }

}
