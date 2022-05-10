package com.company;
import java.util.*;

public class lc_991_Broken_Calculator {
    public static int brokenCalc(int startValue, int target) {
        int ans = 0;
        while (target > startValue) {
            ans++;
            if (target % 2 == 1)
                target++;
            else
                target /= 2;
        }

        return ans + startValue - target;
    }
    public static void main(String[] args){
        //int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        // String s = "22-3*5";
        int orig = 6;
        int target = 13;
        int result = brokenCalc(orig, target);
        System.out.println(result);

    }
}
