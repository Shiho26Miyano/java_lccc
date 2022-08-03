package com.company;
import java.util.*;

public class lc_509_Fibonacci_Number {
    public static int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,3,6,7};
        int target = 5;
        int result = fib(2);
        System.out.println((result));
    }
}
