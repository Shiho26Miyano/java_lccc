package com.company;
import java.util.*;

public class lc_2401_Longest_Nice_Subarray {
    public int longestNiceSubarray(int[] A) {
        int AND = 0, i = 0, res = 0, n = A.length;
        for (int j = 0; j < n; ++j) {
            while ((AND & A[j]) > 0)
                AND ^= A[i++];
            AND |= A[j];
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
