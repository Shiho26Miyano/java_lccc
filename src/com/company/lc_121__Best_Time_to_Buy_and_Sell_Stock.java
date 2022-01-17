package com.company;
import java.util.*;
public class lc_121__Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }


    public static void main(String[] args){
        int[] nums1 = new int[]{7,1,5,3,6,4};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int result =  maxProfit(nums1);
        System.out.println(result);
    }


}
