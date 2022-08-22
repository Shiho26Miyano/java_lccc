package com.company;
import java.util.*;

public class lc_845_Longest_Mountain_in_Array {
    public static int longestMountain(int[] A) {
        if (A.length < 3) return 0;
        int[] increase = new int[A.length];
        int[] decrease = new int[A.length];
        Arrays.fill(increase, 1);
        Arrays.fill(decrease, 1);
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1]) increase[i] = increase[i-1]+1;
        }


        for (int i = A.length-2; i >= 0; i--) {
            if (A[i] > A[i+1]) decrease[i] = decrease[i+1]+1;
        }

        int res = Integer.MIN_VALUE;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                res = Math.max(res, increase[i-1] + decrease[i+1] + 1);
            }
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{0,1,2,4,5,7};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        int result = longestMountain(nums1);
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
