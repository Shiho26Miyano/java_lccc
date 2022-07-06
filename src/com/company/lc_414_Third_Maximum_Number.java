package com.company;

public class lc_414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        // max1 is top max

        for(int i : nums){
            max1 = Math.max(max1, i);
        }

        //if i = max1, continue
        for (int i : nums){
            if (i == max1) continue;
            max2 = Math.max(max2, i);
        }

        // if i = max2 or max1, continue
        for (int i : nums){
            if (i == max2 || i == max1) continue;
            max3 = Math.max(max3, i);
        }
        return (int)(max3 == Long.MIN_VALUE? max1 : max3);

    }

    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        int[] nums2 = new int[]{4,3,6,1,6,8,9,90};
        int target = 2;
        // char[] t = new char[]{'h','e','l','l','o'};
        int r = thirdMax(nums2);
        System.out.println(r);
    }

}
