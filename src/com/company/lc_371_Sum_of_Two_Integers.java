package com.company;

public class lc_371_Sum_of_Two_Integers {
    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        return getSum(a ^ b, (a & b) << 1);
    }
}
