package com.company;
import java.util.*;
//20230716
public class lc_69_Sqrt_x {

    public static int mySqrt(int x) {
        if (x < 2) return x;

        long num;
        int m, left = 2, right = x / 2;

        while (left <= right){
            m = left + (right - left) / 2;
            if (m > x / m){
                right = m - 1;
            }else if (m < x / m){
                left = m + 1;
            } else return m;
        }
        return right;

    }


    public static void main(String[] args){
        //int[] intArray = new int[]{2,7,11,15};
        int target = 7;
        int result = mySqrt(target);
        System.out.println(result);
    }
}
