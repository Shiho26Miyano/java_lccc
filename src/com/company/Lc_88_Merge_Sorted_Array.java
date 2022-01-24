package com.company;
import java.util.*;
public class Lc_88_Merge_Sorted_Array {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }




    public static void main(String[] args){
        int[] intArray1 = new int[]{1,3,5,6,7,0,0};
        int[] intArray2 = new int[]{2,6};
        int m = 5;
        int n = 2;
        int[] result = merge(intArray1, m, intArray2, n);
        System.out.println(Arrays.toString(result));
    }
}
