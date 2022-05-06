package com.company;

import java.util.Arrays;

public class lc_1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0, n = time.length;
        for (int i = 0; i < n; i++) {
            // j starts with i+1 so that i is always to the left of j
            // to avoid repetitive counting
            for (int j = i + 1; j < n; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{30,20,150,100,40};
        int target = 5;
        int result = numPairsDivisibleBy60(intArray);
        System.out.println((result));
    }
}
