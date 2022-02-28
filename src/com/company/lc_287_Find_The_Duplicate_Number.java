package com.company;
import java.util.*;

public class lc_287_Find_The_Duplicate_Number {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1;

    }


    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,1,2,2,2,3,9,10};
        //int[] nums2 = new int[]{2,2,3};
        int val = 3;
        int result =  findDuplicate(nums1);
        //System.out.println(Arrays.toString(result));
        System.out.println((result));
    }




}
