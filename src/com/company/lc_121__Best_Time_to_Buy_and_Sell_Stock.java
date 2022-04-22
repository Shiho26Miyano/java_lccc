package com.company;
import java.util.*;
public class lc_121__Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for (int price: prices) {
            if (price < buy) {
                buy = price;
            }
            else {
                sell = Math.max(sell, price - buy);
            }
        }
        return sell;
    }


    public static void main(String[] args){
        int[] nums1 = new int[]{7,1,5,3,6,4};
        int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        int result =  maxProfit(nums1);
        System.out.println(result);
    }

}
