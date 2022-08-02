package com.company;
import java.util.*;

public class lc_486_Predict_the_Winner {
    public static boolean PredictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 1) >= 0;
    }
    public static int winner(int[] nums, int l, int r, int turn) {
        if (l == r){
            return turn * nums[l];
        }

        int a = turn * nums[l] + winner(nums, l + 1, r, -turn);
        int b = turn * nums[r] + winner(nums, l, r - 1, -turn);
        return turn * Math.max(turn * a, turn * b);

    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,5,2,4};
        int target = 5;
        boolean result = PredictTheWinner(intArray);
        System.out.println((result));
    }
}





