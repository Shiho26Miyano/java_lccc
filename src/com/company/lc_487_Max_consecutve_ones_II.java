package com.company;

public class lc_487_Max_consecutve_ones_II {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int jtilength = 0;
        int k = 1;
        for (int i = 0, j = 0; j < nums.length; j++){
            if (nums[j] == 0) {
                k--;
            }
            while(k < 0){
                if(nums[i] == 0) k++;
                i++;
            }
            jtilength = Math.max(jtilength, j - i + 1);

        }
        return jtilength;

    }


    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        int[] nums2 = new int[]{0,1,1,1,0,1,1,0,1};
        int target = 2;
        // char[] t = new char[]{'h','e','l','l','o'};
        int r = findMaxConsecutiveOnes(nums2);
        System.out.println(r);
    }

}
