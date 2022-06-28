package com.company;

public class lc__487_Max_Consecutive_Ones_II {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeroes = 0;

        // while our window is in bounds
        while (right < nums.length) {

            // add the right most element into our window
            if (nums[right] == 0) {
                numZeroes++;
            }

            // if our window is invalid, contract our window
            while (numZeroes == 2) {
                if (nums[left] == 0) {
                    numZeroes--;
                }
                left++;
            }

            // update our longest sequence answer
            longestSequence = Math.max(longestSequence, right - left + 1);

            // expand our window
            right++;
        }
        return longestSequence;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,0,1,1,0};
        int target = 2;
        String s = "tree";
        int result = findMaxConsecutiveOnes(intArray);
        System.out.println(result);
    }
}
