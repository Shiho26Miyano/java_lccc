package com.company;
import java.util.*;
public class lc_477_Total_Hamming_Distance {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            int ones = 0;
            for(int j = 0; j < nums.length; j++){
                ones += nums[j] & 1;
                nums[j] = nums[j] >> 1;
            }
            res += ones * (nums.length - ones); // ones * zeros
        }
        return res;
    }

}
