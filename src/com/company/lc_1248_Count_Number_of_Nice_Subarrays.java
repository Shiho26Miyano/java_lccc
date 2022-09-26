package com.company;
import java.util.*;

public class lc_1248_Count_Number_of_Nice_Subarrays {
    public int numberOfSubarrays(int[] A, int k) {
        return atMost(A, k) - atMost(A, k - 1);
    }

    public int atMost(int[] A, int k) {
        int best = 0, l = 0;
        for (int r = 0; r < A.length; r++){
            k = k - A[r] % 2;
            while (k < 0){
                k = k + A[l]% 2;
                l++;
            }
            best = best + r - l + 1;
        }
        return best;

    }
}
