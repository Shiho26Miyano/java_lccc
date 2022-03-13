package com.company;

import java.util.Arrays;

public class lc_217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{1,2,3,1};
        //int target = 5;
        boolean result = containsDuplicate(intArray);
        System.out.println(result);
    }
}
