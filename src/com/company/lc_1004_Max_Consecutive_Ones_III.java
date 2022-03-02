package com.company;

public class lc_1004_Max_Consecutive_Ones_III {

    public static int longestOnes(int[] nums, int k) {
        int length1 = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if(nums[j] == 0) {
                k--;
            }
            while(k < 0){
                if(nums[i] == 0) k++;
                i++;
            }
            length1 = Math.max(length1, j - i + 1);
        }
        return length1;
    }


    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        int[] nums2 = new int[]{0,1,1,1,0,0,1,1,1,};
        int target = 2;
       // char[] t = new char[]{'h','e','l','l','o'};
        int r = longestOnes(nums2, target);
        System.out.println(r);
    }

}
