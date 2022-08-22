package com.company;
import java.util.*;

public class lc_845_Longest_Mountain_in_Array {
    public static int longestMountain(int[] A) {
        int N = A.length;
        int ans = 0, base = 0;
        while (base < N) {
            int end = base;
            // if base is a left-boundary
            if (end + 1 < N && A[end] < A[end + 1]) {
                // set end to the peak of this potential mountain
                while (end + 1 < N && A[end] < A[end + 1]) end++;

                // if end is really a peak..
                if (end + 1 < N && A[end] > A[end + 1]) {
                    // set end to the right-boundary of mountain
                    while (end + 1 < N && A[end] > A[end + 1]) end++;
                    // record candidate answer
                    ans = Math.max(ans, end - base + 1);
                }
            }

            base = Math.max(end, base + 1);
        }

        return ans;
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
