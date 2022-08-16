package com.company;
import java.util.*;
public class lc_350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersect(nums2, nums1);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int k = 0;
        for (int num : nums2){
            int count = map.getOrDefault(num, 0);
            if (count > 0){
                nums1[k++] = num;
                map.put(num, count - 1);
            }

        }
        return Arrays.copyOfRange(nums1, 0, k);
        }


    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
