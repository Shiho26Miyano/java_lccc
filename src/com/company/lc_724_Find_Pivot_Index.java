package com.company;
import java.util.*;
public class lc_724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,7,3,6,5,6};
        int target = 5;
        int result = pivotIndex(intArray);
        System.out.println((result));
    }
}
