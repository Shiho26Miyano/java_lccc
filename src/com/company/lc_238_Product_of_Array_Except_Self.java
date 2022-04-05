package com.company;
import java.util.*;

public class lc_238_Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length <= 1) return new int[]{};

        // check input for len = 1
        int n = nums.length;
        int[] rst = new int[n];

        for (int i = 0; i < n; i++) rst[i] = 1; // init

        int carry = nums[0]; // Bulid from left
        for (int i = 1; i < n; i++) carry = multiply(rst, nums, i, carry);

        carry = nums[n - 1]; // Build from right
        for (int i = n - 2; i >= 0; i--) carry = multiply(rst, nums, i, carry);
        return rst;
    }

    private static int multiply(int[] rst, int nums[], int i, int carry) {
        rst[i] *= carry;
        return carry * nums[i];
    }


    public static void main(String[] args){
        int[] intArray = new int[]{1,8,6,2};
        int target = 9;
        int[] result = productExceptSelf(intArray);
        System.out.println(Arrays.toString(result));
    }
}
