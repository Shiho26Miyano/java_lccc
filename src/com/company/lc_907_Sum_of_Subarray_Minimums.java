package com.company;
import java.util.*;

public class lc_907_Sum_of_Subarray_Minimums {
    private static final int MOD = 1_000_000_007;
    public static int sumSubarrayMins(int[] A) {
        int n = A.length;
        int[] left = new int[n];
        Arrays.fill(left, -1);

        int[] right = new int[n];
        Arrays.fill(right, n);

        Deque<Integer> stack = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && A[i] <= A[stack.peekLast()]) {
                left[stack.pollLast()] = i;
            }
            stack.offerLast(i);
        }

        stack.clear();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && A[i] < A[stack.peekLast()]) {
                right[stack.pollLast()] = i;
            }
            stack.offerLast(i);
        }

        long res = 0;
        for (int i = 0; i < n; i++)  {
            long leftRange = (long)i - left[i];
            long rightRange = right[i] - (long)i;
            res = ( res + A[i] * leftRange % MOD * rightRange % MOD ) % MOD;
        }
        return (int)res;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{3,1,2,4};
        //int[] nums2 = new int[]{1,3,4,2};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        int result = sumSubarrayMins(nums1);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }
}
