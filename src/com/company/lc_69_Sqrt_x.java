package com.company;
import java.util.*;
//20230716
public class lc_69_Sqrt_x {

    public static int mySqrt(int x) {
        if (x < 2) return x;

        long num;
        int pivot, left = 2, right = x / 2;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;
            if (num > x) right = pivot - 1;
            else if (num < x) left = pivot + 1;
            else return pivot;
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
