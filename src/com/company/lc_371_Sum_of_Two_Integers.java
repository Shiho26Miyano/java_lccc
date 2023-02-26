package com.company;

//https://leetcode.com/problems/sum-of-two-integers/solutions/2562077/beginner-level-explanation-with-code/
//https://leetcode.com/problems/sum-of-two-integers/solutions/84277/one-liner-with-detailed-explanation/
public class lc_371_Sum_of_Two_Integers {
    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        return getSum(a ^ b, (a & b) << 1);
    }
}
