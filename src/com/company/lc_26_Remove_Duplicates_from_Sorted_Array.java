package com.company;
import java.util.*;

public class lc_26_Remove_Duplicates_from_Sorted_Array {

    public static int[] removeDuplicates(int[] nums) {
       // if (nums.length == 0) return [];
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
                System.out.println(j);
               // System.out.println(i);
            }
        }
        //return i + 1;
        return nums;
    }


    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,1,2,2,2,3,9,10};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int[] result = removeDuplicates(nums1);
        System.out.println(Arrays.toString(result));
    }













}










