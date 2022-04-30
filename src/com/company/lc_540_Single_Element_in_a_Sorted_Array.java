package com.company;

public class lc_540_Single_Element_in_a_Sorted_Array {
    public static int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,1,2,3,3,4,4,8,8};
        //int target =5;
        int result = singleNonDuplicate(intArray);
        System.out.println((result));
    }
}
