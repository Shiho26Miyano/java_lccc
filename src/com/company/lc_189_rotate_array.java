package com.company;

import java.util.Arrays;

public class lc_189_rotate_array {

    public static int[] rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        return nums;
    }
    public static int[] rotate2(int[] nums, int k) {


    }


    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        int[] nums2 = new int[]{2,9,3,6,8,7};
        int target = 3;
        //char[] t = new char[]{'h','e','l','l','o'};
        int[] result = rotate(nums2, target);
        System.out.println(Arrays.toString(result));
    }

}
