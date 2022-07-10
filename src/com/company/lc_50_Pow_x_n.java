package com.company;

public class lc_50_Pow_x_n {
    private static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }
    public static void main(String[] args){
        String[] sArray = new String[]{"5", "2", "C", "D", "+"};
        int i = 10;
        double d = 2.00000;

        double result =myPow(d, i);
        System.out.println(result);
    }


}
