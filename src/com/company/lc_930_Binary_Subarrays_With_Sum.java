package com.company;
import java.util.*;

public class lc_930_Binary_Subarrays_With_Sum {
    public int numSubarraysWithSum(int[] A, int S) {

        return allPoss(A, S) - allPoss(A, S - 1);
    }

    public int allPoss(int[] A, int S) {
        if (S < 0) return 0;
        int best = 0, l = 0;
        for (int r = 0; r < A.length; r++) {
            S = S - A[r];
            while (S < 0){
                S = S + A[l];
                l++;

            }

            best = best + r - l + 1;
        }
        return best;
    }
}

