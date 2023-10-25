package com.company;
import java.util.*;
// method 1 left close, right close
// method 2 left close, right open, then left < right, right = nums.length
public class lc_704_Binary_search {
    public static int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }


    public static void main(String[] args){
       // String x = "00110011";
        int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        int target = 5;
        System.out.println(search(intArray, target));


    }
}
