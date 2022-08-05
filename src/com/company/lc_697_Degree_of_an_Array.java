package com.company;
import java.util.*;

public class lc_697_Degree_of_an_Array {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap(),
                right = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
            System.out.println(left);
            System.out.println(right);
            System.out.println(count);
            System.out.println("that is it");
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,2,2,3,1};
        int target = 5;
        int result = findShortestSubArray(intArray);
        System.out.println((result));
    }
}
