package com.company;
import java.util.*;


public class lc_228_Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String start = String.valueOf(nums[i]);
            int tmpI = i;
            while ((i + 1) < nums.length && (nums[i] + 1) == nums[i + 1]) {
                i++;
            }
            if (tmpI == i) {
                result.add(start);
            } else {
                result.add(start + "->" + String.valueOf(nums[i]));
            }
        }
        return result;

    }
    public static void main(String[] args){
        int[] nums1 = new int[]{0,1,2,4,5,7};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        List<String> result = summaryRanges(nums1);
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
