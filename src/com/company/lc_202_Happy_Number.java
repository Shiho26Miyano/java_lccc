package com.company;
import java.util.*;;

public class lc_202_Happy_Number {
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }



    public static void main(String[] args){
        int[] intArray = new int[]{4,3,2,7,8,2,3,1};
        int target = 19;
        boolean result = isHappy(target);
        System.out.println((result));
    }
}
