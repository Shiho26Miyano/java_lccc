package com.company;

public class lc_1493_Longest_subarray_of_1s_after_deleting_one_element {
    public static int longestSubarray(int[] nums) {
        int k = 1;
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
        int[] nums2 = new int[]{0,1,1,1,0,1,1,0,1};
        int target = 2;
        // char[] t = new char[]{'h','e','l','l','o'};
        int r = longestSubarray(nums2);
        System.out.println(r);
    }

}
