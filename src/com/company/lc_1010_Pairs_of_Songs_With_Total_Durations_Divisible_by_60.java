package com.company;

import java.util.Arrays;

public class lc_1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60 {
    public static  int numPairsDivisibleBy60(int[] time) {
        int[] remainders = new int[60];
        int count = 0;
        for (int t: time) {
            if (t % 60 == 0) { // check if a%60==0 && b%60==0
                count += remainders[0];

            } else { // check if a%60+b%60==60
                System.out.println((60 - t % 60));
                count += remainders[60 - t % 60];
            }
            remainders[t % 60]++; // remember to update the remainders
        }
        return count;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{30,20,150,100,40, 60};
        int target = 5;
        int result = numPairsDivisibleBy60(intArray);
        System.out.println((result));
    }
}
