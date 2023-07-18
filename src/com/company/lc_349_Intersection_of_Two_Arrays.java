package com.company;
import java.util.*;
//Using two HashSet & one Array
//20230717

public class lc_349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];
        int idx = 0;
        for (Integer s : set1) output[idx++] = s;
        return output;
    }



    public static void main(String[] args){
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{7,15};
        //int target = 7;
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
