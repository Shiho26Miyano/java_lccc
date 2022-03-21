package com.company;
import java.util.*;

public class lc_35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
           // System.out.println(pivot);
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]){
                right = pivot - 1;
               }
            else left = pivot + 1;
        }
        return left;
    }



    public static void main(String[] args){
        int[] intArray = new int[]{5,6,1,2,3};
        System.out.println(intArray[4]);
        int target = 2;
        int result = searchInsert(intArray, target);
        System.out.println(result);
    }
}
