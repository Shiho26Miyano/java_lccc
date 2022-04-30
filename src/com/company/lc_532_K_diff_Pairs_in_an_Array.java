package com.company;
import java.util.Arrays;

public class lc_532_K_diff_Pairs_in_an_Array {
    public static int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0, right = 1;
        int result = 0;

        while (left < nums.length && right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                // List item 1 in the text
                right++;
            } else if (nums[right] - nums[left] > k) {
                // List item 2 in the text
                left++;
            } else {
                // List item 3 in the text
                left++;
                result++;
                while (left < nums.length && nums[left] == nums[left - 1])
                    left++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3, 6, 9,11,21};
        int target =5;
        int result = findPairs(intArray, target);
        System.out.println((result));
    }
}
