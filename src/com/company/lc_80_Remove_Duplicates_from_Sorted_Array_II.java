package com.company;
import java.util.*;

public class lc_80_Remove_Duplicates_from_Sorted_Array_II {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2]){
                System.out.println(i++);
                i--;
                nums[i++] = n;


            }


        System.out.println(Arrays.toString(nums));
        return i;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,1,1,2,2,3};
        int x = 12345;
        int result = removeDuplicates(intArray);
        System.out.println((result));

    }
}
