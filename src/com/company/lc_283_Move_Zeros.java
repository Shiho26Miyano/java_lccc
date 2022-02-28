package com.company;
import java.util.*;

public class lc_283_Move_Zeros{
    public static int[] moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length && j < nums.length; j++) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }

        }
        return nums;
    }

    public static void main(String[] args){
        //String x = "12345";
        //String y = "2345";
        int[] t = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(t)));

    }
}