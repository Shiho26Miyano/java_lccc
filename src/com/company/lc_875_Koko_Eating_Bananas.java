package com.company;
import java.util.*;

public class lc_875_Koko_Eating_Bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        // Initalize the left and right boundaries
        int left = 1, right = 1;
        for (int pile : piles) {
         //   System.out.println((pile));
            right = Math.max(right, pile);
        }
        System.out.println(right);

        while (left < right) {
            //initialize the mid index and hour spent
            int middle = (left + right) / 2;
            int hourSpent = 0;
            // sum all hours spent based on the mid index
            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }
            // total hour spent <= h, the new mid should be <= prev mid, make the new mid smaller
            if (hourSpent <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return right;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3, 6, 7, 11};
        int target = 8;
        int result = minEatingSpeed(intArray, target);
        System.out.println((result));
    }
}
