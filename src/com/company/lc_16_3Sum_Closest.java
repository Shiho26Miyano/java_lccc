package com.company;
import java.util.*;
public class lc_16_3Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz; i++){
            int lo = i + 1;
            int hi = sz - 1;

            while (lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum < target){
                    lo++;
                }else{
                    hi--;
                }
                if(Math.abs(target - sum) < Math.abs(diff)){
                    diff = target - sum;

                }
            }
        }
        return target - diff;

    }

    public static void main(String[] args){
        int[] s = {-1, 2, 1, -4};
        int p = 1;
        System.out.println (threeSumClosest(s, p));
    }
}
