package com.company;
import java.util.*;

public class lc_27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];

            }
        }
        return i;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,1,2,2,2,3,9,10};
        //int[] nums2 = new int[]{2,2,3};
        int val = 3;
        int result = removeElement(nums1, val);
        //System.out.println(Arrays.toString(result));
        System.out.println((result));
    }
}
