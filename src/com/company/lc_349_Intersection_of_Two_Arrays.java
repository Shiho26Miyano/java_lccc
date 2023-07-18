package com.company;
import java.util.*;
//Using two HashSet & one Array
//20230717

public class lc_349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();
        HashSet<Integer> res = new HashSet();

        for(int itr = 0; itr < nums1.length; itr++){
            set.add(nums1[itr]);
        }

        for(int itr = 0; itr < nums2.length; itr++){
            if(set.contains(nums2[itr])) res.add(nums2[itr]);
        }

        int[] arr = new int[res.size()];
        int jtr = 0;
        for (int itr : res)
            arr[jtr++] = itr;

        return arr;
    }



    public static void main(String[] args){
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{7,15};
        //int target = 7;
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
