package com.company;
import java.util.*;

public class lc_581_Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] A) {
        int n = A.length, begin = -1, end = -2, min = A[n - 1], max = A[0];
        for (int i = 1; i < n; i++){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n - 1 - i]);
            if (A[i] < max) end = i;
            if (A[n - 1 - i] > min) begin = n - 1 - i;
        }
        return end - begin + 1;

    }
}
