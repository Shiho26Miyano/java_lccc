package com.company;
import java.util.*;

import java.util.Arrays;

public class lc_217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>(nums.length);
        for (int n : nums){
            if (mySet.contains(n)) return true;
            mySet.add(n);
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
