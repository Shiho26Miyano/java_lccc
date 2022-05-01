package com.company;

public class lc_540_Single_Element_in_a_Sorted_Array {
    public static int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.println((mid));
            System.out.println((nums[mid]));
            System.out.println((nums[mid + 1]));
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
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        //int target =5;
        int result = singleNonDuplicate(intArray);
        System.out.println((result));
    }
}
