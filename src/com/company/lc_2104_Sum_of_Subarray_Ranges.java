package com.company;
import java.util.*;


public class lc_2104_Sum_of_Subarray_Ranges {
    static class Pair {
        int index;
        long count;

        public Pair(int index, long count) {
            this.index = index;
            this.count = count;
        }
    }
    public static long subArrayRanges(int[] nums) {

        ArrayDeque<Pair> stack = new ArrayDeque<>();
        int N = nums.length;
        long[] left = new long[N];
        long[] right = new long[N];
        long allMax = 0;
        long allMin = 0;

        //find allMax value

        for(int i = 0 ; i < nums.length ; i++) {
            long localCount = 1;
            while(!stack.isEmpty() && nums[stack.peek().index] <= nums[i]) {
                Pair p = stack.pop();
                localCount += p.count;
            }
            stack.push(new Pair(i, localCount));
            left[i] = localCount;
        }

        stack.clear();

        for(int i = nums.length - 1 ; i >= 0 ; i--) {
            long localCount = 1;
            while(!stack.isEmpty() && nums[stack.peek().index] < nums[i]) {
                Pair p = stack.pop();
                localCount += p.count;
            }
            stack.push(new Pair(i, localCount));
            right[i] = localCount;
        }

        for(int i = 0 ; i < N ; i++) {
            allMax += nums[i]*left[i]*right[i];
        }

        stack.clear();

        for(int i = 0 ; i < nums.length ; i++) {
            long localCount = 1;
            while(!stack.isEmpty() && nums[stack.peek().index] >= nums[i]) {
                Pair p = stack.pop();
                localCount += p.count;
            }
            stack.push(new Pair(i, localCount));
            left[i] = localCount;
        }

        stack.clear();

        for(int i = nums.length - 1 ; i >= 0 ; i--) {
            long localCount = 1;
            while(!stack.isEmpty() && nums[stack.peek().index] > nums[i]) {
                Pair p = stack.pop();
                localCount += p.count;
            }
            stack.push(new Pair(i, localCount));
            right[i] = localCount;
        }

        for(int i = 0 ; i < N ; i++) {
            allMin += nums[i]*left[i]*right[i];
        }

        return allMax - allMin;

    }

    public static long subArrayRanges2(int[] A) {
        long res = 0;
        for (int i = 0; i < A.length; i++) {
            int max = A[i], min = A[i];
            for (int j = i; j < A.length; j++) {
                max = Math.max(max, A[j]);
                min = Math.min(min, A[j]);
                res += max - min;
            }
        }
        return res;
    }
    public static void main(String[] args){
        //String s = "weeaaaaaek";
        int[] t = new int[]{1,2,3};
        int k = 4;
        long result =  subArrayRanges(t);
        System.out.println((result));
    }
}
