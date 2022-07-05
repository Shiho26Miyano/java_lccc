package com.company;
import java.util.*;

public class lc_220_Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && (long) s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= (long) g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,5,9,1,5,9};
        int target = 2;
        String s = "tree";
        boolean result = containsNearbyAlmostDuplicate(intArray, 2, 3);
        System.out.println(result);
    }
}
