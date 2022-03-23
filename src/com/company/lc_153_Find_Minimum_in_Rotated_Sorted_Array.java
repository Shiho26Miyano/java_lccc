package com.company;
import java.util.*;

public class lc_153_Find_Minimum_in_Rotated_Sorted_Array {
    public static int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int start = 0, end = nums.length - 1;
        if(nums[end] > nums[0]){
            return nums[0];
        }

        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) start = mid + 1;
            else end = mid - 1;


        }
        return - 1;
    
    }



    public static void main(String[] args) {
        int[] intArray = new int[]{8, 9, 5, 6, 7};
        int target = 6;
        int result = findMin(intArray);
        System.out.println(result);
    }
}
