package com.company;
import java.util.*;

public class lc_1099_Two_Sum_Less_Than_K {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = -1, n = nums.length;
        int l = 0, r = n - 1;
        while(l < r){
            if (nums[l] + nums[r] < k){
                answer = Math.max(answer, nums[l] + nums[r]);
                l++;
            }else{
                r--;
            }

        }
        return answer;

    }

}
