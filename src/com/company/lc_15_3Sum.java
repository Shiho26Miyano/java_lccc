package com.company;
import java.util.*;
public class lc_15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum < 0){
                    lo++;
                } else if (sum > 0){
                    hi--;
                } else{
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                    lo++;
                    hi--;

                }
            }
        }
        return res;
    }


    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        int[] nums2 = new int[]{-1,0,1,2,-1,-4};
        //int target = 10001;
        //char[] t = new char[]{'h','e','l','l','o'};
        List<List<Integer>> t = threeSum(nums2);
        System.out.println(t);
    }
}
