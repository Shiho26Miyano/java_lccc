package com.company;
import java.util.*;

public class lc_930_Binary_Subarrays_With_Sum {
    public int numSubarraysWithSum(int[] A, int S) {

        return allPoss(A, S) - allPoss(A, S - 1);
    }

    public int allPoss(int[] A, int S) {
        if (S < 0) return 0;
        int res = 0, i = 0, n = A.length;
        for (int j = 0; j < n; j++) {
            S = S - A[j];
            while (S < 0)
                S = S + A[i++];
            res = res + j - i + 1;
        }
        return res;
    }
}

