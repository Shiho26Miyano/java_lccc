package com.company;
import java.util.*;

public class lc_1015_Smallest_Integer_Divisible_by_K {
    public static int smallestRepunitDivByK(int K) {
        int remainder = 0;
        for (int length_N = 1; length_N <= K; length_N++) {
            remainder = (remainder * 10 + 1) % K;
            if (remainder == 0) {
                return length_N;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        int p = 1;
        //int target =5;
        int result = smallestRepunitDivByK(p);
        System.out.println((result));
    }
}
