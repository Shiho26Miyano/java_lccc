package com.company;
import java.util.*;


public class lc_228_Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<>();
        for (int i = 0, j = 0; j < nums.length; ++j) {
            // check if j + 1 extends the range [nums[i], nums[j]]
            if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1)
                continue;
            // put the range [nums[i], nums[j]] into the list
            if (i == j)
                summary.add(nums[i] + "");
            else
                summary.add(nums[i] + "->" + nums[j]);
            i = j + 1;
        }
        return summary;
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
