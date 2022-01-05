package com.company;
import java.util.*;

public class lc_167_Two_sum_II_Input_Array_is_sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;
        while (lo < hi) {
            int curSum = numbers[lo] + numbers[hi];
            if (curSum == target) {
                return new int[]{lo + 1, hi + 1};
            } else if (curSum > target) {
                hi--;
            } else {
                lo++;
            }
        }
        return new int[]{-1, -1};
    }



    public static void main(String[] args){
        int[] intArray = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
    }
}
