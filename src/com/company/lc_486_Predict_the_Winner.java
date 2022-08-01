package com.company;
import java.util.*;

public class lc_486_Predict_the_Winner {
    public static boolean PredictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 1) >= 0;
    }
    public static int winner(int[] nums, int s, int e, int turn) {
        if (s == e)
            return turn * nums[s];
        System.out.println((turn));
        int a = turn * nums[s] + winner(nums, s + 1, e, -turn);
        int b = turn * nums[e] + winner(nums, s, e - 1, -turn);
        return turn * Math.max(turn * a, turn * b);

    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,5,2,4};
        int target = 5;
        boolean result = PredictTheWinner(intArray);
        System.out.println((result));
    }
}


