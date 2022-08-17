package com.company;
import java.util.*;

public class lc_923_3Sum_With_Multiplicity {
    public static int threeSumMulti(int[] A, int target) {
        int MOD = 1000000007;
        Map<Integer, Long> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }
        long result = 0;
        for (int num1 : map.keySet()) {
            for (int num2 : map.keySet()) {
                int num3 = target - num1 - num2;
                if (map.containsKey(num3)) {
                    Long count1 = map.get(num1);
                    Long count2 = map.get(num2);
                    Long count3 = map.get(num3);
                    if (num1 == num2 && num1 == num3) {
                        result = (result + (count1 * (count1 - 1) * (count1 - 2) / 6)) % MOD;
                    } else if (num1 == num2 && num1 != num3) {
                        result = (result + (count1 * (count1 - 1) / 2) * count3) % MOD;
                    } else if (num1 < num2 && num2 < num3) {
                        result = (result + count1 * count2 * count3) % MOD;
                    }
                }
            }
        }
        return (int) result;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,2,2,3,3,4,4,5,5};
        //int[] nums2 = new int[]{2,2,3};
        int val = 8;
        int result = threeSumMulti(nums1, val);
        //System.out.println(Arrays.toString(result));
        System.out.println((result));
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
