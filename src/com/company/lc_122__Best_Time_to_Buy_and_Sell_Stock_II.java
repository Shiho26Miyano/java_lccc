package com.company;
import java.util.*;
public class lc_122__Best_Time_to_Buy_and_Sell_Stock_II {

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }


    public static void main(String[] args){
        int[] nums1 = new int[]{7,1,5,3,6,4};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int result =  maxProfit(nums1);
        System.out.println(result);
    }


}
