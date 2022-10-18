package com.company;
import java.util.*;;

public class lc_202_Happy_Number {
    public static boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;

        }
        return false;

    }


    public static void main(String[] args){
        int[] intArray = new int[]{4,3,2,7,8,2,3,1};
        int target = 19;
        boolean result = isHappy(target);
        System.out.println((result));
    }
}
