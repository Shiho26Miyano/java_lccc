package com.company;
import java.util.*;
//20230716

public class lc_560_Subarray_Sum_Equals_K {

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        // purpose to map.put(0, 1) is including equal condition in counter such as 2 - 1 - 1 = 0, then counter 1
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{1};
        int target = 1;
        int result = subarraySum(intArray, target);
        System.out.println(result);
    }
}
