package com.company;

public class lc_1004_Max_Consecutive_Ones_III {

    public static int longestOnes(int[] A, int K) {
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) K--;
            if (K < 0 && A[i++] == 0) K++;
        }
        return j - i;
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
