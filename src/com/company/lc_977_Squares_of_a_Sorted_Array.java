package com.company;
import java.util.*;

public class lc_977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        int left = 0;
        int right = N - 1;

        for (int i = right; i >= 0; i--){
            int square;

            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            }else{
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }


    public static void main(String[] args){
        int[] intArray = new int[]{-4,-1,0,3,10};
        String s = "PAYPALISHIRING";
        String p = "abc";
        System.out.println(Arrays.toString(intArray));
    }
}
