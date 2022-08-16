package com.company;
import java.util.*;
public class lc_350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        int k = 0;
        for (int n : nums2) {
            int cnt = m.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                m.put(n, cnt - 1);
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
