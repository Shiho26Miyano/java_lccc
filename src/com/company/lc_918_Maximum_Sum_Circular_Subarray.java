package com.company;
import java.util.*;
public class lc_918_Maximum_Sum_Circular_Subarray {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curSumMax = 0, minSum = A[0], curSumMin = 0;
        for (int a : A) {
            curSumMax = Math.max(curSumMax + a, a);
            maxSum = Math.max(maxSum, curSumMax);
            curSumMin = Math.min(curSumMin + a, a);
            minSum = Math.min(minSum, curSumMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
