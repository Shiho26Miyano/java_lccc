package com.company;
import java.util.*;
public class lc_26_Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,2};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int result = removeDuplicates(nums1);
        System.out.println(result);
    }













}










