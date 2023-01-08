package com.company;

public class lc_326_Power_of_Three {

    public boolean isPowerOfThree2(int n) {
        if(n == 0 ) return false;
        while (n != 1){
            int r = n % 3;
            n = n /3;
            if (r != 0)
                return false;
        }
        return true;
    }
}
