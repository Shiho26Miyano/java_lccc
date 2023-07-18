package com.company;
import java.util.*;
//Using two HashSet & one Array
//20230717

public class lc_349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++){
            if (set1.contains(nums2[j])) set2.add(nums2[j]);
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2){
            result[index++] = num;

        }
        return result;
    }



    public static void main(String[] args){
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{7,15};
        //int target = 7;
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
