package com.company;

public class lc_162_Find_Peak_Element {
    ///linear sacan
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
    ///iterative binary search
    public static int findPeakElement2(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }



    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,1,3,5,6,4};
        int target = 6;
        int result1 = findPeakElement(intArray);
        int result2 = findPeakElement2(intArray);
        System.out.println(result1);
        System.out.println(result2);
    }
}
