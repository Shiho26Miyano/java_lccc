package com.company;
import java.util.*;

public class lc_1004_Max_Consecutive_Ones_III {

    public static int longestOnes(int[] nums, int k) {
        int l = 0, r;
        for (r = 0; r < nums.length; r++){
            if (nums[r] == 0) k--;
            if (k < 0 ) {
                if (nums[l] == 0)k++;
                l++;
            }

        }
        return r - l;
    }
    public int longestOnes2(int[] nums, int k) {
        int l = 0, best = 0, r;
        for (r = 0; r < nums.length; r++){
            if (nums[r] == 0) k--;
            if (k < 0 ) {
                if (nums[l] == 0)k++;
                l++;
            }
            best = Math.max(best, r - l + 1);

        }
        return best;
    }

    public int longestOnes3(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        int l = 0, r;

        for (r = 0; r < nums.length; r++){
            count.put(nums[r], count.getOrDefault(nums[r], 0) + 1);
            if (count.getOrDefault(0, 0) > k){
                count.put(nums[l], count.get(nums[l]) - 1);
                l++;
            }

        }
        return r - l;

    }

    public int longestOnes4(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        int l = 0, best = 0;

        for (int r = 0; r < nums.length; r++){
            count.put(nums[r], count.getOrDefault(nums[r], 0) + 1);
            while (count.getOrDefault(0, 0) > k){
                count.put(nums[l], count.get(nums[l]) - 1);
                l++;
            }
            best = Math.max(best, r - l + 1);

        }
        return best;

    }
    public static void main(String[] args){
        //String s = "addccggazfeezddh";
        int[] nums2 = new int[]{0,1,1,1,0,0,1,1,1,};
        int target = 2;
       // char[] t = new char[]{'h','e','l','l','o'};
        int r = longestOnes(nums2, target);
        System.out.println(r);
    }

}
