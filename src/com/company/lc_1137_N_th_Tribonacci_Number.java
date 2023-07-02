package com.company;

public class lc_1137_N_th_Tribonacci_Number {
    /////////////method 1 recurrsion 
    public int tribonacci(int n) {
        return helper (n, 0, 1, 1);

    }
    private int helper(int n, int i0, int i1, int i2){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (n == 3) return i0 + i1 + i2;
        return helper (n - 1, i1, i2, i0 + i1 + i2);
    }
    ///////////method 2
    public int tribonacci_dp(int n) {
        int i0 = 0, i1 = 1, i2 = 1;
        for(int i = 1;i<=n;i++){
            int next = i0+i1+i2;
            i0 = i1;
            i1 = i2;
            i2 = next;
        }
        return i0;
    }
}
