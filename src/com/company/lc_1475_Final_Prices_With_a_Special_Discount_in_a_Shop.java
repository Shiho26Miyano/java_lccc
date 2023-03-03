package com.company;
import java.util.*;

public class lc_1475_Final_Prices_With_a_Special_Discount_in_a_Shop {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return prices;


    }
}