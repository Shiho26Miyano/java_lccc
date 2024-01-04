package com.company;

public class lc_2461_Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
    public long maximumSubarraySum(int[] nums, int k) {
        int startIndex = 0;
        long subSum = 0;
        long maxSubSum = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int endIndex = 0; endIndex < nums.length; endIndex++) {
            int end = nums[endIndex];
            subSum += end;

            map.put(end, map.getOrDefault(end, 0) + 1);

            while (map.size() > k || map.getOrDefault(end, 0) > 1) {
                int start = nums[startIndex];
                subSum -= start;
                map.put(start, map.get(start) - 1);

                if (map.get(start) == 0) {
                    map.remove(start);
                }


                startIndex++;
            }

            if (map.size() == k) {
                maxSubSum = Math.max(maxSubSum, subSum);
            }
        }
        return maxSubSum != Integer.MIN_VALUE ? maxSubSum : 0;
    }
}
