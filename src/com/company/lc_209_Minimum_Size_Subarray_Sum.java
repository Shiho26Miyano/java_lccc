package com.company;

public class lc_209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int startIndex = 0;
        int minSubSize = Integer.MAX_VALUE;
        int sumSub = 0;

        for (int endIndex = startIndex; endIndex < nums.length; endIndex++){
            int end = nums[endIndex];
            sumSub = sumSub + end;

            while(sumSub >= target){
                minSubSize = Math.min(minSubSize, endIndex - startIndex + 1);
                sumSub = sumSub - nums[startIndex];
                startIndex++;
            }


        }
        return minSubSize != Integer.MAX_VALUE ?  minSubSize : 0 ;

    }
}