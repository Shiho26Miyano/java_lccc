package com.company;
import java.util.*;

public class lc_220_Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet();
        for (int i = 0; i < nums.length; i++){

            Long floor = set.floor((long)nums[i]);
            if (floor != null && nums[i] - floor <= t ){
                return true;
            }

            Long ceiling = set.ceiling((long)nums[i]);
            if (ceiling != null && ceiling - nums[i] <= t){
                return true;
            }
            set.add((long)nums[i]);
            if(set.size() > k){
                set.remove((long)nums[i - k]);
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
