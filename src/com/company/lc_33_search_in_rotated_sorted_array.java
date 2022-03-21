package com.company;
import java.util.*;

public class lc_33_search_in_rotated_sorted_array {
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else {
                if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 3, 5, 6, 7};
        int target = 6;
        int result = search(intArray, target);
        System.out.println(result);
    }
}