package com.company;
import java.util.*;

public class lc_231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,2,6,3,4,5,6,7};
        int target = 5;
        boolean result = isPowerOfTwo(1);
        System.out.println((result));
    }
}
