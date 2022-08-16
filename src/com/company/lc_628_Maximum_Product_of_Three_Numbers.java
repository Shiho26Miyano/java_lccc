package com.company;
import java.util.*;


public class lc_628_Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,3};
        //int[] nums2 = new int[]{2,2,3};
        int val = 3;
        int result = maximumProduct(nums1);
        //System.out.println(Arrays.toString(result));
        System.out.println((result));
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
